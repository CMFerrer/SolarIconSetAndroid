package dev.chiksmedina.solar.outline.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.WeatherGroup

val WeatherGroup.CloudStorm: ImageVector
    get() {
        if (_cloudStorm != null) {
            return _cloudStorm!!
        }
        _cloudStorm = Builder(
            name = "CloudStorm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.4762f, 3.75f)
                curveTo(9.7261f, 3.75f, 7.5119f, 5.9508f, 7.5119f, 8.6471f)
                curveTo(7.5119f, 9.1092f, 7.5766f, 9.5555f, 7.6973f, 9.9781f)
                curveTo(8.1945f, 10.1216f, 8.6599f, 10.3389f, 9.0805f, 10.6171f)
                curveTo(9.4259f, 10.8456f, 9.5207f, 11.3109f, 9.2922f, 11.6564f)
                curveTo(9.0637f, 12.0019f, 8.5983f, 12.0967f, 8.2529f, 11.8681f)
                curveTo(7.8721f, 11.6162f, 7.4392f, 11.4355f, 6.9733f, 11.3451f)
                curveTo(6.7515f, 11.3021f, 6.5216f, 11.2794f, 6.2857f, 11.2794f)
                curveTo(4.3246f, 11.2794f, 2.75f, 12.8482f, 2.75f, 14.7647f)
                curveTo(2.75f, 15.839f, 3.2424f, 16.8014f, 4.0233f, 17.4432f)
                curveTo(4.3432f, 17.7062f, 4.3895f, 18.1788f, 4.1265f, 18.4988f)
                curveTo(3.8635f, 18.8188f, 3.3908f, 18.865f, 3.0708f, 18.602f)
                curveTo(1.9611f, 17.69f, 1.25f, 16.3103f, 1.25f, 14.7647f)
                curveTo(1.25f, 12.0605f, 3.4199f, 9.8721f, 6.1135f, 9.7823f)
                curveTo(6.0467f, 9.4136f, 6.0119f, 9.0341f, 6.0119f, 8.6471f)
                curveTo(6.0119f, 5.1057f, 8.9145f, 2.25f, 12.4762f, 2.25f)
                curveTo(15.6343f, 2.25f, 18.2724f, 4.4937f, 18.8314f, 7.4713f)
                curveTo(21.1313f, 8.4475f, 22.75f, 10.7093f, 22.75f, 13.3529f)
                curveTo(22.75f, 15.5563f, 21.6241f, 17.4962f, 19.919f, 18.6446f)
                curveTo(19.5754f, 18.876f, 19.1093f, 18.7851f, 18.8779f, 18.4416f)
                curveTo(18.6465f, 18.098f, 18.7375f, 17.6319f, 19.081f, 17.4005f)
                curveTo(20.3941f, 16.5161f, 21.25f, 15.0315f, 21.25f, 13.3529f)
                curveTo(21.25f, 11.2162f, 19.8607f, 9.3909f, 17.9124f, 8.7246f)
                curveTo(17.4038f, 8.5507f, 16.8568f, 8.4559f, 16.2857f, 8.4559f)
                curveTo(15.7031f, 8.4559f, 15.1455f, 8.5546f, 14.6283f, 8.7353f)
                curveTo(14.2372f, 8.8719f, 13.8095f, 8.6656f, 13.6729f, 8.2745f)
                curveTo(13.5363f, 7.8835f, 13.7426f, 7.4557f, 14.1336f, 7.3192f)
                curveTo(14.8079f, 7.0836f, 15.5326f, 6.9559f, 16.2857f, 6.9559f)
                curveTo(16.5812f, 6.9559f, 16.8723f, 6.9756f, 17.1577f, 7.0137f)
                curveTo(16.477f, 5.1163f, 14.6422f, 3.75f, 12.4762f, 3.75f)
                close()
                moveTo(10.8539f, 14.5104f)
                curveTo(11.1243f, 14.8242f, 11.0891f, 15.2978f, 10.7753f, 15.5682f)
                lineTo(8.0195f, 17.9426f)
                horizontalLineTo(10.2857f)
                curveTo(10.5992f, 17.9426f, 10.8797f, 18.1376f, 10.9888f, 18.4315f)
                curveTo(11.0979f, 18.7254f, 11.0128f, 19.0562f, 10.7752f, 19.2608f)
                lineTo(6.4895f, 22.9531f)
                curveTo(6.1757f, 23.2235f, 5.7021f, 23.1883f, 5.4318f, 22.8745f)
                curveTo(5.1614f, 22.5606f, 5.1967f, 22.0871f, 5.5105f, 21.8167f)
                lineTo(8.2661f, 19.4426f)
                horizontalLineTo(6.0f)
                curveTo(5.6865f, 19.4426f, 5.4061f, 19.2476f, 5.2969f, 18.9537f)
                curveTo(5.1878f, 18.6598f, 5.2729f, 18.3291f, 5.5104f, 18.1244f)
                lineTo(9.7962f, 14.4318f)
                curveTo(10.11f, 14.1614f, 10.5835f, 14.1966f, 10.8539f, 14.5104f)
                close()
                moveTo(15.5303f, 14.9697f)
                curveTo(15.8232f, 15.2626f, 15.8232f, 15.7374f, 15.5303f, 16.0303f)
                lineTo(13.5303f, 18.0303f)
                curveTo(13.2374f, 18.3232f, 12.7626f, 18.3232f, 12.4697f, 18.0303f)
                curveTo(12.1768f, 17.7374f, 12.1768f, 17.2626f, 12.4697f, 16.9697f)
                lineTo(14.4697f, 14.9697f)
                curveTo(14.7626f, 14.6768f, 15.2374f, 14.6768f, 15.5303f, 14.9697f)
                close()
                moveTo(17.5303f, 18.4697f)
                curveTo(17.8232f, 18.7626f, 17.8232f, 19.2374f, 17.5303f, 19.5303f)
                lineTo(15.5303f, 21.5303f)
                curveTo(15.2374f, 21.8232f, 14.7626f, 21.8232f, 14.4697f, 21.5303f)
                curveTo(14.1768f, 21.2374f, 14.1768f, 20.7626f, 14.4697f, 20.4697f)
                lineTo(16.4697f, 18.4697f)
                curveTo(16.7626f, 18.1768f, 17.2374f, 18.1768f, 17.5303f, 18.4697f)
                close()
                moveTo(13.5303f, 19.4697f)
                curveTo(13.8232f, 19.7626f, 13.8232f, 20.2374f, 13.5303f, 20.5303f)
                lineTo(11.5303f, 22.5303f)
                curveTo(11.2374f, 22.8232f, 10.7626f, 22.8232f, 10.4697f, 22.5303f)
                curveTo(10.1768f, 22.2374f, 10.1768f, 21.7626f, 10.4697f, 21.4697f)
                lineTo(12.4697f, 19.4697f)
                curveTo(12.7626f, 19.1768f, 13.2374f, 19.1768f, 13.5303f, 19.4697f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.4762f, 3.75f)
                curveTo(9.7261f, 3.75f, 7.5119f, 5.9508f, 7.5119f, 8.6471f)
                curveTo(7.5119f, 9.1092f, 7.5766f, 9.5555f, 7.6973f, 9.9781f)
                curveTo(8.1945f, 10.1216f, 8.6599f, 10.3389f, 9.0805f, 10.6171f)
                curveTo(9.4259f, 10.8456f, 9.5207f, 11.3109f, 9.2922f, 11.6564f)
                curveTo(9.0637f, 12.0019f, 8.5983f, 12.0967f, 8.2529f, 11.8681f)
                curveTo(7.8721f, 11.6162f, 7.4392f, 11.4355f, 6.9733f, 11.3451f)
                curveTo(6.7515f, 11.3021f, 6.5216f, 11.2794f, 6.2857f, 11.2794f)
                curveTo(4.3246f, 11.2794f, 2.75f, 12.8482f, 2.75f, 14.7647f)
                curveTo(2.75f, 15.839f, 3.2424f, 16.8014f, 4.0233f, 17.4432f)
                curveTo(4.3432f, 17.7062f, 4.3895f, 18.1788f, 4.1265f, 18.4988f)
                curveTo(3.8635f, 18.8188f, 3.3908f, 18.865f, 3.0708f, 18.602f)
                curveTo(1.9611f, 17.69f, 1.25f, 16.3103f, 1.25f, 14.7647f)
                curveTo(1.25f, 12.0605f, 3.4199f, 9.8721f, 6.1135f, 9.7823f)
                curveTo(6.0467f, 9.4136f, 6.0119f, 9.0341f, 6.0119f, 8.6471f)
                curveTo(6.0119f, 5.1057f, 8.9145f, 2.25f, 12.4762f, 2.25f)
                curveTo(15.6343f, 2.25f, 18.2724f, 4.4937f, 18.8314f, 7.4713f)
                curveTo(21.1313f, 8.4475f, 22.75f, 10.7093f, 22.75f, 13.3529f)
                curveTo(22.75f, 15.5563f, 21.6241f, 17.4962f, 19.919f, 18.6446f)
                curveTo(19.5754f, 18.876f, 19.1093f, 18.7851f, 18.8779f, 18.4416f)
                curveTo(18.6465f, 18.098f, 18.7375f, 17.6319f, 19.081f, 17.4005f)
                curveTo(20.3941f, 16.5161f, 21.25f, 15.0315f, 21.25f, 13.3529f)
                curveTo(21.25f, 11.2162f, 19.8607f, 9.3909f, 17.9124f, 8.7246f)
                curveTo(17.4038f, 8.5507f, 16.8568f, 8.4559f, 16.2857f, 8.4559f)
                curveTo(15.7031f, 8.4559f, 15.1455f, 8.5546f, 14.6283f, 8.7353f)
                curveTo(14.2372f, 8.8719f, 13.8095f, 8.6656f, 13.6729f, 8.2745f)
                curveTo(13.5363f, 7.8835f, 13.7426f, 7.4557f, 14.1336f, 7.3192f)
                curveTo(14.8079f, 7.0836f, 15.5326f, 6.9559f, 16.2857f, 6.9559f)
                curveTo(16.5812f, 6.9559f, 16.8723f, 6.9756f, 17.1577f, 7.0137f)
                curveTo(16.477f, 5.1163f, 14.6422f, 3.75f, 12.4762f, 3.75f)
                close()
            }
        }
            .build()
        return _cloudStorm!!
    }

private var _cloudStorm: ImageVector? = null
