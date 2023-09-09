package com.chiksmedina.solar.outline.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.WeatherGroup

public val WeatherGroup.CloudyMoon: ImageVector
    get() {
        if (_cloudyMoon != null) {
            return _cloudyMoon!!
        }
        _cloudyMoon = Builder(name = "CloudyMoon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.0174f, 2.8016f)
                curveTo(6.3707f, 3.2922f, 2.75f, 7.2233f, 2.75f, 12.0f)
                curveTo(2.75f, 12.9681f, 2.8985f, 13.9001f, 3.1733f, 14.7753f)
                curveTo(3.2975f, 15.1704f, 3.0777f, 15.5914f, 2.6825f, 15.7155f)
                curveTo(2.2874f, 15.8397f, 1.8664f, 15.6199f, 1.7423f, 15.2247f)
                curveTo(1.4222f, 14.2058f, 1.25f, 13.1223f, 1.25f, 12.0f)
                curveTo(1.25f, 6.0629f, 6.0629f, 1.25f, 12.0f, 1.25f)
                curveTo(12.7166f, 1.25f, 13.0754f, 1.8213f, 13.1368f, 2.2763f)
                curveTo(13.196f, 2.714f, 13.0342f, 3.2706f, 12.531f, 3.5747f)
                curveTo(10.8627f, 4.5828f, 9.75f, 6.4118f, 9.75f, 8.5f)
                curveTo(9.75f, 8.9142f, 9.4142f, 9.25f, 9.0f, 9.25f)
                curveTo(8.5858f, 9.25f, 8.25f, 8.9142f, 8.25f, 8.5f)
                curveTo(8.25f, 6.1874f, 9.3331f, 4.1283f, 11.0174f, 2.8016f)
                close()
                moveTo(21.1984f, 12.9826f)
                curveTo(20.881f, 15.9896f, 19.123f, 18.5677f, 16.6245f, 20.013f)
                curveTo(16.2659f, 20.2204f, 16.1434f, 20.6792f, 16.3508f, 21.0377f)
                curveTo(16.5582f, 21.3963f, 17.017f, 21.5188f, 17.3755f, 21.3114f)
                curveTo(20.5868f, 19.4538f, 22.75f, 15.98f, 22.75f, 12.0f)
                curveTo(22.75f, 11.2834f, 22.1787f, 10.9246f, 21.7237f, 10.8632f)
                curveTo(21.286f, 10.804f, 20.7293f, 10.9658f, 20.4253f, 11.469f)
                curveTo(19.4172f, 13.1373f, 17.5882f, 14.25f, 15.5f, 14.25f)
                curveTo(15.0858f, 14.25f, 14.75f, 14.5858f, 14.75f, 15.0f)
                curveTo(14.75f, 15.4142f, 15.0858f, 15.75f, 15.5f, 15.75f)
                curveTo(17.8126f, 15.75f, 19.8717f, 14.6668f, 21.1984f, 12.9826f)
                close()
                moveTo(8.8095f, 12.75f)
                curveTo(7.1358f, 12.75f, 5.8452f, 14.03f, 5.8452f, 15.5294f)
                curveTo(5.8452f, 15.7371f, 5.8694f, 15.939f, 5.9152f, 16.1331f)
                curveTo(6.2074f, 16.2276f, 6.4829f, 16.3579f, 6.7358f, 16.5188f)
                curveTo(7.0854f, 16.7411f, 7.1885f, 17.2046f, 6.9662f, 17.5542f)
                curveTo(6.7439f, 17.9037f, 6.2803f, 18.0068f, 5.9308f, 17.7845f)
                curveTo(5.7111f, 17.6447f, 5.4598f, 17.5435f, 5.188f, 17.4928f)
                curveTo(5.0585f, 17.4687f, 4.9241f, 17.4559f, 4.7857f, 17.4559f)
                curveTo(3.6249f, 17.4559f, 2.75f, 18.3408f, 2.75f, 19.3529f)
                curveTo(2.75f, 20.365f, 3.6249f, 21.25f, 4.7857f, 21.25f)
                horizontalLineTo(11.2857f)
                curveTo(12.9594f, 21.25f, 14.25f, 19.97f, 14.25f, 18.4706f)
                curveTo(14.25f, 17.2796f, 13.4429f, 16.2336f, 12.2665f, 15.8468f)
                curveTo(11.9608f, 15.7463f, 11.631f, 15.6912f, 11.2857f, 15.6912f)
                curveTo(10.9335f, 15.6912f, 10.5973f, 15.7486f, 10.2864f, 15.853f)
                curveTo(9.8937f, 15.9849f, 9.4685f, 15.7735f, 9.3366f, 15.3808f)
                curveTo(9.2048f, 14.9881f, 9.4162f, 14.5629f, 9.8088f, 14.431f)
                curveTo(10.2724f, 14.2753f, 10.7697f, 14.1912f, 11.2857f, 14.1912f)
                curveTo(11.3266f, 14.1912f, 11.3674f, 14.1917f, 11.408f, 14.1928f)
                curveTo(10.9093f, 13.343f, 9.9464f, 12.75f, 8.8095f, 12.75f)
                close()
                moveTo(13.1656f, 14.5882f)
                curveTo(12.7141f, 12.6544f, 10.9117f, 11.25f, 8.8095f, 11.25f)
                curveTo(6.3805f, 11.25f, 4.3452f, 13.1303f, 4.3452f, 15.5294f)
                curveTo(4.3452f, 15.6813f, 4.3535f, 15.8314f, 4.3697f, 15.9794f)
                curveTo(2.6408f, 16.1759f, 1.25f, 17.5813f, 1.25f, 19.3529f)
                curveTo(1.25f, 21.2647f, 2.8695f, 22.75f, 4.7857f, 22.75f)
                horizontalLineTo(11.2857f)
                curveTo(13.7147f, 22.75f, 15.75f, 20.8697f, 15.75f, 18.4706f)
                curveTo(15.75f, 16.7327f, 14.6761f, 15.2619f, 13.1656f, 14.5882f)
                close()
            }
        }
        .build()
        return _cloudyMoon!!
    }

private var _cloudyMoon: ImageVector? = null
