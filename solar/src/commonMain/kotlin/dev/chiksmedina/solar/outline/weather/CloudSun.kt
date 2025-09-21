package dev.chiksmedina.solar.outline.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.WeatherGroup

val WeatherGroup.CloudSun: ImageVector
    get() {
        if (_cloudSun != null) {
            return _cloudSun!!
        }
        _cloudSun = Builder(
            name = "CloudSun", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(7.0f, 2.75f)
                curveTo(4.6528f, 2.75f, 2.75f, 4.6528f, 2.75f, 7.0f)
                curveTo(2.75f, 8.7285f, 3.782f, 10.2176f, 5.2664f, 10.8817f)
                curveTo(5.5414f, 10.8257f, 5.8245f, 10.7919f, 6.1135f, 10.7823f)
                curveTo(6.0467f, 10.4136f, 6.0119f, 10.0341f, 6.0119f, 9.6471f)
                curveTo(6.0119f, 7.0481f, 7.5752f, 4.8184f, 9.815f, 3.8158f)
                curveTo(9.0649f, 3.1519f, 8.0794f, 2.75f, 7.0f, 2.75f)
                close()
                moveTo(11.4296f, 3.3335f)
                curveTo(10.3759f, 2.062f, 8.7827f, 1.25f, 7.0f, 1.25f)
                curveTo(3.8244f, 1.25f, 1.25f, 3.8244f, 1.25f, 7.0f)
                curveTo(1.25f, 8.8751f, 2.1474f, 10.5395f, 3.5347f, 11.5887f)
                curveTo(2.1608f, 12.4772f, 1.25f, 14.0127f, 1.25f, 15.7647f)
                curveTo(1.25f, 18.5264f, 3.513f, 20.75f, 6.2857f, 20.75f)
                horizontalLineTo(16.2857f)
                curveTo(19.8474f, 20.75f, 22.75f, 17.8943f, 22.75f, 14.3529f)
                curveTo(22.75f, 11.7093f, 21.1313f, 9.4475f, 18.8314f, 8.4713f)
                curveTo(18.2724f, 5.4937f, 15.6343f, 3.25f, 12.4762f, 3.25f)
                curveTo(12.12f, 3.25f, 11.7703f, 3.2786f, 11.4296f, 3.3335f)
                close()
                moveTo(17.1577f, 8.0137f)
                curveTo(16.477f, 6.1163f, 14.6422f, 4.75f, 12.4762f, 4.75f)
                curveTo(9.7261f, 4.75f, 7.5119f, 6.9508f, 7.5119f, 9.6471f)
                curveTo(7.5119f, 10.1092f, 7.5766f, 10.5555f, 7.6973f, 10.9781f)
                curveTo(8.1945f, 11.1216f, 8.6599f, 11.3389f, 9.0805f, 11.6171f)
                curveTo(9.4259f, 11.8456f, 9.5207f, 12.3109f, 9.2922f, 12.6564f)
                curveTo(9.0637f, 13.0019f, 8.5983f, 13.0967f, 8.2529f, 12.8681f)
                curveTo(7.8721f, 12.6162f, 7.4392f, 12.4355f, 6.9733f, 12.3451f)
                curveTo(6.7515f, 12.3021f, 6.5216f, 12.2794f, 6.2857f, 12.2794f)
                curveTo(4.3246f, 12.2794f, 2.75f, 13.8482f, 2.75f, 15.7647f)
                curveTo(2.75f, 17.6812f, 4.3246f, 19.25f, 6.2857f, 19.25f)
                horizontalLineTo(16.2857f)
                curveTo(19.0358f, 19.25f, 21.25f, 17.0492f, 21.25f, 14.3529f)
                curveTo(21.25f, 12.2162f, 19.8607f, 10.3909f, 17.9124f, 9.7246f)
                curveTo(17.4038f, 9.5507f, 16.8568f, 9.4559f, 16.2857f, 9.4559f)
                curveTo(15.9662f, 9.4559f, 15.6542f, 9.4856f, 15.3522f, 9.5422f)
                curveTo(14.9451f, 9.6185f, 14.5175f, 9.4183f, 14.381f, 9.0272f)
                curveTo(14.2444f, 8.6362f, 14.4502f, 8.2039f, 14.8544f, 8.1134f)
                curveTo(15.3153f, 8.0102f, 15.7945f, 7.9559f, 16.2857f, 7.9559f)
                curveTo(16.5812f, 7.9559f, 16.8723f, 7.9756f, 17.1577f, 8.0137f)
                close()
            }
        }
            .build()
        return _cloudSun!!
    }

private var _cloudSun: ImageVector? = null
