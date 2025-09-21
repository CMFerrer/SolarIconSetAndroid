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

val WeatherGroup.CloudSun2: ImageVector
    get() {
        if (_cloudSun2 != null) {
            return _cloudSun2!!
        }
        _cloudSun2 = Builder(
            name = "CloudSun2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(7.5f, 1.25f)
                curveTo(7.9142f, 1.25f, 8.25f, 1.5858f, 8.25f, 2.0f)
                verticalLineTo(2.5f)
                curveTo(8.25f, 2.9142f, 7.9142f, 3.25f, 7.5f, 3.25f)
                curveTo(7.0858f, 3.25f, 6.75f, 2.9142f, 6.75f, 2.5f)
                verticalLineTo(2.0f)
                curveTo(6.75f, 1.5858f, 7.0858f, 1.25f, 7.5f, 1.25f)
                close()
                moveTo(3.0809f, 3.0806f)
                curveTo(3.3737f, 2.7877f, 3.8486f, 2.7877f, 4.1415f, 3.0806f)
                lineTo(4.3576f, 3.2966f)
                curveTo(4.6505f, 3.5895f, 4.6505f, 4.0644f, 4.3576f, 4.3573f)
                curveTo(4.0647f, 4.6502f, 3.5898f, 4.6502f, 3.2969f, 4.3573f)
                lineTo(3.0809f, 4.1413f)
                curveTo(2.788f, 3.8484f, 2.788f, 3.3735f, 3.0809f, 3.0806f)
                close()
                moveTo(11.919f, 3.0807f)
                curveTo(12.2119f, 3.3736f, 12.2119f, 3.8485f, 11.919f, 4.1414f)
                lineTo(11.7029f, 4.3575f)
                curveTo(11.41f, 4.6503f, 10.9352f, 4.6503f, 10.6423f, 4.3575f)
                curveTo(10.3494f, 4.0646f, 10.3494f, 3.5897f, 10.6423f, 3.2968f)
                lineTo(10.8583f, 3.0807f)
                curveTo(11.1512f, 2.7878f, 11.6261f, 2.7878f, 11.919f, 3.0807f)
                close()
                moveTo(8.0f, 5.25f)
                curveTo(7.4147f, 5.25f, 6.8742f, 5.432f, 6.4291f, 5.7425f)
                curveTo(6.3032f, 5.8303f, 6.1849f, 5.9284f, 6.0754f, 6.0357f)
                curveTo(5.5652f, 6.5357f, 5.25f, 7.2304f, 5.25f, 8.0f)
                curveTo(5.25f, 8.8326f, 5.62f, 9.5796f, 6.2059f, 10.0844f)
                curveTo(6.6816f, 8.2083f, 7.9939f, 6.6642f, 9.724f, 5.8574f)
                curveTo(9.6744f, 5.8173f, 9.6233f, 5.779f, 9.5709f, 5.7425f)
                curveTo(9.1258f, 5.432f, 8.5853f, 5.25f, 8.0f, 5.25f)
                close()
                moveTo(11.324f, 5.3514f)
                curveTo(11.2154f, 5.2153f, 11.0986f, 5.086f, 10.9744f, 4.9643f)
                curveTo(10.8058f, 4.7991f, 10.6234f, 4.6478f, 10.4291f, 4.5122f)
                curveTo(9.7404f, 4.0318f, 8.902f, 3.75f, 8.0f, 3.75f)
                curveTo(7.098f, 3.75f, 6.2596f, 4.0318f, 5.5709f, 4.5122f)
                curveTo(5.3766f, 4.6478f, 5.1942f, 4.7991f, 5.0256f, 4.9643f)
                curveTo(4.2393f, 5.7348f, 3.75f, 6.8109f, 3.75f, 8.0f)
                curveTo(3.75f, 9.6305f, 4.6682f, 11.0452f, 6.0128f, 11.7576f)
                curveTo(6.0188f, 12.1064f, 6.0531f, 12.4487f, 6.1135f, 12.7823f)
                curveTo(3.4199f, 12.8721f, 1.25f, 15.0605f, 1.25f, 17.7647f)
                curveTo(1.25f, 20.5264f, 3.513f, 22.75f, 6.2857f, 22.75f)
                horizontalLineTo(16.2857f)
                curveTo(19.8474f, 22.75f, 22.75f, 19.8943f, 22.75f, 16.3529f)
                curveTo(22.75f, 13.7093f, 21.1313f, 11.4475f, 18.8314f, 10.4713f)
                curveTo(18.2724f, 7.4937f, 15.6343f, 5.25f, 12.4762f, 5.25f)
                curveTo(12.0831f, 5.25f, 11.698f, 5.2848f, 11.324f, 5.3514f)
                close()
                moveTo(17.1577f, 10.0137f)
                curveTo(16.477f, 8.1163f, 14.6422f, 6.75f, 12.4762f, 6.75f)
                curveTo(9.7261f, 6.75f, 7.5119f, 8.9508f, 7.5119f, 11.6471f)
                curveTo(7.5119f, 12.1092f, 7.5766f, 12.5555f, 7.6973f, 12.9781f)
                curveTo(8.1945f, 13.1216f, 8.6599f, 13.3389f, 9.0805f, 13.6171f)
                curveTo(9.4259f, 13.8456f, 9.5207f, 14.3109f, 9.2922f, 14.6564f)
                curveTo(9.0637f, 15.0019f, 8.5983f, 15.0967f, 8.2529f, 14.8681f)
                curveTo(7.8721f, 14.6162f, 7.4392f, 14.4355f, 6.9733f, 14.3451f)
                curveTo(6.7515f, 14.3021f, 6.5216f, 14.2794f, 6.2857f, 14.2794f)
                curveTo(4.3246f, 14.2794f, 2.75f, 15.8482f, 2.75f, 17.7647f)
                curveTo(2.75f, 19.6812f, 4.3246f, 21.25f, 6.2857f, 21.25f)
                horizontalLineTo(16.2857f)
                curveTo(19.0358f, 21.25f, 21.25f, 19.0492f, 21.25f, 16.3529f)
                curveTo(21.25f, 14.2162f, 19.8607f, 12.3909f, 17.9124f, 11.7246f)
                curveTo(17.4038f, 11.5507f, 16.8568f, 11.4559f, 16.2857f, 11.4559f)
                curveTo(15.7031f, 11.4559f, 15.1455f, 11.5546f, 14.6283f, 11.7353f)
                curveTo(14.2372f, 11.8718f, 13.8095f, 11.6656f, 13.6729f, 11.2745f)
                curveTo(13.5363f, 10.8835f, 13.7426f, 10.4557f, 14.1336f, 10.3192f)
                curveTo(14.8079f, 10.0836f, 15.5326f, 9.9559f, 16.2857f, 9.9559f)
                curveTo(16.5812f, 9.9559f, 16.8723f, 9.9755f, 17.1577f, 10.0137f)
                close()
                moveTo(1.25f, 7.5f)
                curveTo(1.25f, 7.0858f, 1.5858f, 6.75f, 2.0f, 6.75f)
                horizontalLineTo(2.5f)
                curveTo(2.9142f, 6.75f, 3.25f, 7.0858f, 3.25f, 7.5f)
                curveTo(3.25f, 7.9142f, 2.9142f, 8.25f, 2.5f, 8.25f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 8.25f, 1.25f, 7.9142f, 1.25f, 7.5f)
                close()
                moveTo(4.3576f, 10.6427f)
                curveTo(4.6505f, 10.9356f, 4.6505f, 11.4105f, 4.3576f, 11.7034f)
                lineTo(4.1415f, 11.9194f)
                curveTo(3.8486f, 12.2123f, 3.3737f, 12.2123f, 3.0809f, 11.9194f)
                curveTo(2.788f, 11.6265f, 2.788f, 11.1516f, 3.0809f, 10.8588f)
                lineTo(3.2969f, 10.6427f)
                curveTo(3.5898f, 10.3498f, 4.0647f, 10.3498f, 4.3576f, 10.6427f)
                close()
            }
        }
            .build()
        return _cloudSun2!!
    }

private var _cloudSun2: ImageVector? = null
