package dev.chiksmedina.solar.bold.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.SportsGroup

val SportsGroup.BodyShape: ImageVector
    get() {
        if (_bodyShape != null) {
            return _bodyShape!!
        }
        _bodyShape = Builder(
            name = "BodyShape", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(21.8363f, 17.462f)
                curveTo(21.393f, 16.4155f, 20.8141f, 15.4631f, 20.3001f, 14.6177f)
                curveTo(20.1159f, 14.3146f, 19.94f, 14.0252f, 19.7817f, 13.7502f)
                horizontalLineTo(4.2183f)
                curveTo(4.06f, 14.0252f, 3.8841f, 14.3146f, 3.6999f, 14.6177f)
                curveTo(3.1859f, 15.4631f, 2.607f, 16.4155f, 2.1637f, 17.462f)
                curveTo(1.6305f, 18.7206f, 1.25f, 20.1846f, 1.25f, 22.0002f)
                curveTo(1.25f, 22.4144f, 1.5858f, 22.7502f, 2.0f, 22.7502f)
                curveTo(2.4142f, 22.7502f, 2.75f, 22.4144f, 2.75f, 22.0002f)
                curveTo(2.75f, 20.5096f, 3.04f, 19.3045f, 3.4587f, 18.2564f)
                curveTo(8.8529f, 18.4033f, 10.9185f, 21.1273f, 11.2885f, 22.2374f)
                curveTo(11.3906f, 22.5436f, 11.6772f, 22.7502f, 12.0f, 22.7502f)
                curveTo(12.3228f, 22.7502f, 12.6094f, 22.5436f, 12.7115f, 22.2374f)
                curveTo(13.0815f, 21.1273f, 15.1471f, 18.4033f, 20.5413f, 18.2564f)
                curveTo(20.96f, 19.3045f, 21.25f, 20.5096f, 21.25f, 22.0002f)
                curveTo(21.25f, 22.4144f, 21.5858f, 22.7502f, 22.0f, 22.7502f)
                curveTo(22.4142f, 22.7502f, 22.75f, 22.4144f, 22.75f, 22.0002f)
                curveTo(22.75f, 20.1846f, 22.3695f, 18.7206f, 21.8363f, 17.462f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(4.6898f, 1.7059f)
                curveTo(4.5273f, 1.3249f, 4.0867f, 1.1478f, 3.7057f, 1.3103f)
                curveTo(3.3248f, 1.4728f, 3.1477f, 1.9136f, 3.3102f, 2.2945f)
                lineTo(3.3109f, 2.2963f)
                lineTo(3.3145f, 2.3047f)
                lineTo(3.3298f, 2.3414f)
                curveTo(3.3435f, 2.3743f, 3.3639f, 2.4241f, 3.3902f, 2.4894f)
                curveTo(3.4429f, 2.6201f, 3.5188f, 2.8128f, 3.6102f, 3.0567f)
                curveTo(3.7932f, 3.5449f, 4.0376f, 4.2365f, 4.282f, 5.0464f)
                curveTo(4.7746f, 6.6794f, 5.25f, 8.7395f, 5.25f, 10.5716f)
                curveTo(5.25f, 11.1648f, 5.1376f, 11.7108f, 4.9424f, 12.2502f)
                horizontalLineTo(19.0576f)
                curveTo(18.8624f, 11.7108f, 18.75f, 11.1648f, 18.75f, 10.5716f)
                curveTo(18.75f, 8.7395f, 19.2254f, 6.6794f, 19.718f, 5.0464f)
                curveTo(19.9624f, 4.2365f, 20.2068f, 3.5449f, 20.3898f, 3.0567f)
                curveTo(20.4812f, 2.8128f, 20.5571f, 2.6201f, 20.6098f, 2.4894f)
                curveTo(20.6361f, 2.4241f, 20.6565f, 2.3743f, 20.6702f, 2.3414f)
                lineTo(20.6855f, 2.3047f)
                lineTo(20.6891f, 2.2963f)
                lineTo(20.6899f, 2.2943f)
                curveTo(20.8523f, 1.9134f, 20.6752f, 1.4728f, 20.2943f, 1.3103f)
                curveTo(19.9133f, 1.1478f, 19.4724f, 1.3255f, 19.3099f, 1.7065f)
                curveTo(19.3099f, 1.7065f, 19.3101f, 1.7059f, 20.0f, 2.0002f)
                lineTo(19.3099f, 1.7065f)
                lineTo(19.3094f, 1.7076f)
                lineTo(19.308f, 1.711f)
                lineTo(19.303f, 1.7228f)
                lineTo(19.2849f, 1.7662f)
                curveTo(19.2692f, 1.8039f, 19.2467f, 1.8586f, 19.2184f, 1.929f)
                curveTo(19.1616f, 2.0699f, 19.0813f, 2.2739f, 18.9852f, 2.5302f)
                curveTo(18.7932f, 3.0424f, 18.5376f, 3.7656f, 18.282f, 4.6132f)
                curveTo(17.801f, 6.2076f, 17.3045f, 8.2906f, 17.2542f, 10.2502f)
                horizontalLineTo(6.7458f)
                curveTo(6.6955f, 8.2906f, 6.199f, 6.2076f, 5.718f, 4.6132f)
                curveTo(5.4624f, 3.7656f, 5.2068f, 3.0424f, 5.0148f, 2.5302f)
                curveTo(4.9187f, 2.2739f, 4.8384f, 2.0699f, 4.7816f, 1.929f)
                curveTo(4.7533f, 1.8586f, 4.7308f, 1.8039f, 4.7151f, 1.7662f)
                lineTo(4.697f, 1.7228f)
                lineTo(4.692f, 1.711f)
                lineTo(4.6906f, 1.7076f)
                lineTo(4.6898f, 1.7059f)
                close()
            }
        }
            .build()
        return _bodyShape!!
    }

private var _bodyShape: ImageVector? = null
