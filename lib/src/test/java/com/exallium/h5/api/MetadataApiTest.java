package com.exallium.h5.api;

import com.exallium.h5.api.models.metadata.CSRDesignation;
import com.exallium.h5.api.models.metadata.CampaignMission;
import com.exallium.h5.api.models.metadata.Commendation;
import com.exallium.h5.api.models.metadata.Enemy;
import com.exallium.h5.api.models.metadata.FlexibleStat;
import com.exallium.h5.api.models.metadata.GameBaseVariant;
import com.exallium.h5.api.models.metadata.GameVariant;
import com.exallium.h5.api.models.metadata.Map;
import com.exallium.h5.api.models.metadata.Medal;
import com.exallium.h5.api.models.metadata.Playlist;
import com.exallium.h5.api.models.metadata.Skull;
import com.exallium.h5.api.models.metadata.SpartanRank;
import com.exallium.h5.api.models.metadata.TeamColor;
import com.exallium.h5.api.models.metadata.Vehicle;
import com.exallium.h5.api.models.metadata.Weapon;
import com.exallium.h5.api.utils.KeyReader;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import retrofit.Response;

import java.io.IOException;
import java.util.List;

@RunWith(JUnit4.class)
public class MetadataApiTest {

    private static String apiKey;

    @BeforeClass
    public static void setUpClass() {
        apiKey = KeyReader.getApiKey();
    }

    @Test
    public void testWeapons() throws IOException {
        ApiFactory factory = new ApiFactory(apiKey);
        Metadata metadata = factory.getMetadata();
        Response<List<Weapon>> weapons = metadata.getWeapons().execute();
        Assert.assertEquals(200, weapons.code());
    }

    @Test
    public void testVehicles() throws IOException {
        ApiFactory factory = new ApiFactory(apiKey);
        Metadata metadata = factory.getMetadata();
        Response<List<Vehicle>> vehicles = metadata.getVehicles().execute();
        Assert.assertEquals(200, vehicles.code());
    }

    @Test
    public void testTeamColor() throws IOException {
        ApiFactory factory = new ApiFactory(apiKey);
        Metadata metadata = factory.getMetadata();
        Response<List<TeamColor>> teamColors = metadata.getTeamColors().execute();
        Assert.assertEquals(200, teamColors.code());
    }

    @Test
    public void testSpartanRank() throws IOException {
        ApiFactory factory = new ApiFactory(apiKey);
        Metadata metadata = factory.getMetadata();
        Response<List<SpartanRank>> spartanRanks = metadata.getSpartanRanks().execute();
        Assert.assertEquals(200, spartanRanks.code());
    }

    @Test
    public void testSkull() throws IOException {
        ApiFactory factory = new ApiFactory(apiKey);
        Metadata metadata = factory.getMetadata();
        Response<List<Skull>> skulls = metadata.getSkulls().execute();
        Assert.assertEquals(200, skulls.code());
    }

    @Test
    public void testCampaignMissions() throws IOException {
        ApiFactory factory = new ApiFactory(apiKey);
        Metadata metadata = factory.getMetadata();
        Response<List<CampaignMission>> campaignMissions = metadata.getCampaignMissions().execute();
        Assert.assertEquals(200, campaignMissions.code());
    }

    @Test
    public void testCommendations() throws IOException {
        ApiFactory factory = new ApiFactory(apiKey);
        Metadata metadata = factory.getMetadata();
        Response<List<Commendation>> commendations = metadata.getCommendations().execute();
        Assert.assertEquals(200, commendations.code());
    }

    @Test
    public void testCSRDesignations() throws IOException {
        ApiFactory factory = new ApiFactory(apiKey);
        Metadata metadata = factory.getMetadata();
        Response<List<CSRDesignation>> csrDesignations = metadata.getCSRDesignations().execute();
        Assert.assertEquals(200, csrDesignations.code());
    }

    @Test
    public void testEnemies() throws IOException {
        ApiFactory factory = new ApiFactory(apiKey);
        Metadata metadata = factory.getMetadata();
        Response<List<Enemy>> enemies = metadata.getEnemies().execute();
        Assert.assertEquals(200, enemies.code());
    }

    @Test
    public void testFlexibleStats() throws IOException {
        ApiFactory factory = new ApiFactory(apiKey);
        Metadata metadata = factory.getMetadata();
        Response<List<FlexibleStat>> flexibleStats = metadata.getFlexibleStats().execute();
        Assert.assertEquals(200, flexibleStats.code());
    }

    @Test
    public void testGameBaseVariants() throws IOException {
        ApiFactory factory = new ApiFactory(apiKey);
        Metadata metadata = factory.getMetadata();
        Response<List<GameBaseVariant>> gameBaseVariants = metadata.getGameBaseVariants().execute();
        Assert.assertEquals(200, gameBaseVariants.code());
    }

    @Test
    public void testImpulses() throws IOException {
        ApiFactory factory = new ApiFactory(apiKey);
        Metadata metadata = factory.getMetadata();
        Response<List<GameVariant>> impulses = metadata.getImpulses().execute();
        Assert.assertEquals(200, impulses.code());
    }

    @Test
    public void testMaps() throws IOException {
        ApiFactory factory = new ApiFactory(apiKey);
        Metadata metadata = factory.getMetadata();
        Response<List<Map>> maps = metadata.getMaps().execute();
        Assert.assertEquals(200, maps.code());
    }

    @Test
    public void testMedals() throws IOException {
        ApiFactory factory = new ApiFactory(apiKey);
        Metadata metadata = factory.getMetadata();
        Response<List<Medal>> response = metadata.getMedals().execute();
        Assert.assertEquals(200, response.code());
    }

    @Test
    public void testPlaylists() throws IOException {
        ApiFactory factory = new ApiFactory(apiKey);
        Metadata metadata = factory.getMetadata();
        Response<List<Playlist>> response = metadata.getPlaylists().execute();
        Assert.assertEquals(200, response.code());
    }
}
