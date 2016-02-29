package com.dota2apiclient.ApiClient.Models;


public class ApiConstants {
    public static class Url {
        public static String dota = "IDOTA2Match_570";

        public static String economics = "IEconDOTA2_570";

        public static String users = "ISteamUser";
    }

    public static class Methods {
        public static String GetMatchHistory = "/IDOTA2Match_570/GetMatchHistory/v001/";
        public static String GetMatchDetails = "/IDOTA2Match_570/GetMatchDetails/v001/";
        public static String GetHeroes = "/IEconDOTA2_570/GetHeroes/v0001/";
        public static String GetGameItems = "/IEconDOTA2_570/GetGameItems/V001/";
        public static String GetPlayerSummaries = "/ISteamUser/GetPlayerSummaries/v0002/";
        public static String EconomySchema = "/IEconItems_570/GetSchema/v0001/";
        public static String GetLeagueListing = "/IDOTA2Match_570/GetLeagueListing/v0001/";
        public static String GetLiveLeagueGames = "/IDOTA2Match_570/GetLiveLeagueGames/v0001/    ";
        public static String GetMatchHistoryBySequenceNum = "/IDOTA2Match_570/GetMatchHistoryBySequenceNum/v0001/";
        public static String GetTeamInfoByTeamID = "/IDOTA2Match_570/GetTeamInfoByTeamID/v001/";
        public static String ResolveVanityUrl = "/ISteamUser/ResolveVanityURL/v0001/";

        public static String GetIdsByUsername = "/search/users/#filter=users&";//&text=nick
        public static String GetIdsByUsernameAjax = "/search/SearchCommunityAjax/";
        public static String GetProfile = "/profiles/";//76561197999421200/?xml=1";
    }

    public static class Versions {
        public static String v1 = "V001";
        public static String v2 = "V002";
    }
}
