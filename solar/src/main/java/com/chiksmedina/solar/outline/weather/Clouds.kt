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

val WeatherGroup.Clouds: ImageVector
    get() {
        if (_clouds != null) {
            return _clouds!!
        }
        _clouds = Builder(
            name = "Clouds", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.4762f, 2.75f)
                curveTo(9.7261f, 2.75f, 7.5119f, 4.9508f, 7.5119f, 7.6471f)
                curveTo(7.5119f, 8.1092f, 7.5766f, 8.5555f, 7.6973f, 8.9781f)
                curveTo(8.1945f, 9.1216f, 8.6599f, 9.3389f, 9.0805f, 9.6171f)
                curveTo(9.4259f, 9.8456f, 9.5207f, 10.3109f, 9.2922f, 10.6564f)
                curveTo(9.0637f, 11.0019f, 8.5983f, 11.0967f, 8.2529f, 10.8681f)
                curveTo(7.8721f, 10.6162f, 7.4392f, 10.4355f, 6.9733f, 10.3451f)
                curveTo(6.7515f, 10.3021f, 6.5216f, 10.2794f, 6.2857f, 10.2794f)
                curveTo(4.3246f, 10.2794f, 2.75f, 11.8482f, 2.75f, 13.7647f)
                curveTo(2.75f, 15.6812f, 4.3246f, 17.25f, 6.2857f, 17.25f)
                curveTo(6.6999f, 17.25f, 7.0357f, 17.5858f, 7.0357f, 18.0f)
                curveTo(7.0357f, 18.4142f, 6.6999f, 18.75f, 6.2857f, 18.75f)
                curveTo(3.513f, 18.75f, 1.25f, 16.5264f, 1.25f, 13.7647f)
                curveTo(1.25f, 11.0605f, 3.4199f, 8.8721f, 6.1135f, 8.7823f)
                curveTo(6.0467f, 8.4136f, 6.0119f, 8.0341f, 6.0119f, 7.6471f)
                curveTo(6.0119f, 4.1057f, 8.9145f, 1.25f, 12.4762f, 1.25f)
                curveTo(15.6343f, 1.25f, 18.2724f, 3.4937f, 18.8314f, 6.4713f)
                curveTo(21.1313f, 7.4475f, 22.75f, 9.7093f, 22.75f, 12.3529f)
                curveTo(22.75f, 12.7672f, 22.4142f, 13.1029f, 22.0f, 13.1029f)
                curveTo(21.5858f, 13.1029f, 21.25f, 12.7672f, 21.25f, 12.3529f)
                curveTo(21.25f, 10.2162f, 19.8607f, 8.3909f, 17.9124f, 7.7246f)
                curveTo(17.4038f, 7.5507f, 16.8568f, 7.4559f, 16.2857f, 7.4559f)
                curveTo(15.7031f, 7.4559f, 15.1455f, 7.5546f, 14.6283f, 7.7353f)
                curveTo(14.2372f, 7.8719f, 13.8095f, 7.6656f, 13.6729f, 7.2745f)
                curveTo(13.5363f, 6.8835f, 13.7426f, 6.4557f, 14.1336f, 6.3192f)
                curveTo(14.8079f, 6.0836f, 15.5326f, 5.9559f, 16.2857f, 5.9559f)
                curveTo(16.5812f, 5.9559f, 16.8723f, 5.9756f, 17.1577f, 6.0137f)
                curveTo(16.477f, 4.1163f, 14.6422f, 2.75f, 12.4762f, 2.75f)
                close()
                moveTo(15.8095f, 12.75f)
                curveTo(14.1359f, 12.75f, 12.8452f, 14.03f, 12.8452f, 15.5294f)
                curveTo(12.8452f, 15.7371f, 12.8694f, 15.939f, 12.9152f, 16.1331f)
                curveTo(13.2074f, 16.2276f, 13.4829f, 16.3579f, 13.7359f, 16.5188f)
                curveTo(14.0854f, 16.7411f, 14.1885f, 17.2046f, 13.9662f, 17.5542f)
                curveTo(13.7439f, 17.9037f, 13.2803f, 18.0068f, 12.9308f, 17.7845f)
                curveTo(12.7111f, 17.6447f, 12.4598f, 17.5435f, 12.1879f, 17.4928f)
                curveTo(12.0585f, 17.4687f, 11.9241f, 17.4559f, 11.7857f, 17.4559f)
                curveTo(10.6249f, 17.4559f, 9.75f, 18.3408f, 9.75f, 19.3529f)
                curveTo(9.75f, 20.365f, 10.6249f, 21.25f, 11.7857f, 21.25f)
                horizontalLineTo(18.2857f)
                curveTo(19.9594f, 21.25f, 21.25f, 19.97f, 21.25f, 18.4706f)
                curveTo(21.25f, 17.2796f, 20.4429f, 16.2336f, 19.2665f, 15.8468f)
                curveTo(18.9608f, 15.7463f, 18.631f, 15.6912f, 18.2857f, 15.6912f)
                curveTo(17.9335f, 15.6912f, 17.5973f, 15.7486f, 17.2864f, 15.853f)
                curveTo(16.8937f, 15.9849f, 16.4685f, 15.7735f, 16.3366f, 15.3808f)
                curveTo(16.2048f, 14.9881f, 16.4162f, 14.5629f, 16.8088f, 14.431f)
                curveTo(17.2724f, 14.2753f, 17.7697f, 14.1912f, 18.2857f, 14.1912f)
                curveTo(18.3266f, 14.1912f, 18.3674f, 14.1917f, 18.408f, 14.1928f)
                curveTo(17.9093f, 13.343f, 16.9463f, 12.75f, 15.8095f, 12.75f)
                close()
                moveTo(20.1656f, 14.5882f)
                curveTo(19.7141f, 12.6544f, 17.9117f, 11.25f, 15.8095f, 11.25f)
                curveTo(13.3805f, 11.25f, 11.3452f, 13.1303f, 11.3452f, 15.5294f)
                curveTo(11.3452f, 15.6813f, 11.3535f, 15.8314f, 11.3697f, 15.9794f)
                curveTo(9.6408f, 16.1759f, 8.25f, 17.5813f, 8.25f, 19.3529f)
                curveTo(8.25f, 21.2647f, 9.8695f, 22.75f, 11.7857f, 22.75f)
                horizontalLineTo(18.2857f)
                curveTo(20.7147f, 22.75f, 22.75f, 20.8697f, 22.75f, 18.4706f)
                curveTo(22.75f, 16.7327f, 21.6761f, 15.2619f, 20.1656f, 14.5882f)
                close()
            }
        }
            .build()
        return _clouds!!
    }

private var _clouds: ImageVector? = null
