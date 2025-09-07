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

val WeatherGroup.Cloud: ImageVector
    get() {
        if (_cloud != null) {
            return _cloud!!
        }
        _cloud = Builder(
            name = "Cloud", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.4762f, 4.75f)
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
                curveTo(15.7031f, 9.4559f, 15.1455f, 9.5546f, 14.6283f, 9.7353f)
                curveTo(14.2372f, 9.8719f, 13.8095f, 9.6656f, 13.6729f, 9.2745f)
                curveTo(13.5363f, 8.8835f, 13.7426f, 8.4558f, 14.1336f, 8.3192f)
                curveTo(14.8079f, 8.0836f, 15.5326f, 7.9559f, 16.2857f, 7.9559f)
                curveTo(16.5812f, 7.9559f, 16.8723f, 7.9756f, 17.1577f, 8.0137f)
                curveTo(16.477f, 6.1163f, 14.6422f, 4.75f, 12.4762f, 4.75f)
                close()
                moveTo(18.8314f, 8.4713f)
                curveTo(18.2724f, 5.4937f, 15.6343f, 3.25f, 12.4762f, 3.25f)
                curveTo(8.9145f, 3.25f, 6.0119f, 6.1057f, 6.0119f, 9.6471f)
                curveTo(6.0119f, 10.0341f, 6.0467f, 10.4136f, 6.1135f, 10.7823f)
                curveTo(3.4199f, 10.8721f, 1.25f, 13.0605f, 1.25f, 15.7647f)
                curveTo(1.25f, 18.5264f, 3.513f, 20.75f, 6.2857f, 20.75f)
                horizontalLineTo(16.2857f)
                curveTo(19.8474f, 20.75f, 22.75f, 17.8943f, 22.75f, 14.3529f)
                curveTo(22.75f, 11.7093f, 21.1313f, 9.4475f, 18.8314f, 8.4713f)
                close()
            }
        }
            .build()
        return _cloud!!
    }

private var _cloud: ImageVector? = null
