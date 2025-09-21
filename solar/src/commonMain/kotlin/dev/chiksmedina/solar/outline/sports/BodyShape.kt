package dev.chiksmedina.solar.outline.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.SportsGroup

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
                pathFillType = EvenOdd
            ) {
                moveTo(3.7057f, 1.3103f)
                curveTo(4.0867f, 1.1478f, 4.5273f, 1.3249f, 4.6898f, 1.7059f)
                lineTo(4.0002f, 2.0001f)
                curveTo(4.6898f, 1.7059f, 4.6898f, 1.7058f, 4.6898f, 1.7059f)
                lineTo(4.6906f, 1.7076f)
                lineTo(4.692f, 1.711f)
                lineTo(4.697f, 1.7228f)
                lineTo(4.7151f, 1.7662f)
                curveTo(4.7308f, 1.8039f, 4.7533f, 1.8586f, 4.7816f, 1.929f)
                curveTo(4.8384f, 2.0699f, 4.9187f, 2.2739f, 5.0148f, 2.5302f)
                curveTo(5.2068f, 3.0424f, 5.4624f, 3.7656f, 5.718f, 4.6132f)
                curveTo(6.199f, 6.2076f, 6.6955f, 8.2906f, 6.7458f, 10.2502f)
                horizontalLineTo(17.2542f)
                curveTo(17.3045f, 8.2906f, 17.801f, 6.2076f, 18.282f, 4.6132f)
                curveTo(18.5376f, 3.7656f, 18.7932f, 3.0424f, 18.9852f, 2.5302f)
                curveTo(19.0813f, 2.2739f, 19.1616f, 2.0699f, 19.2184f, 1.929f)
                curveTo(19.2467f, 1.8586f, 19.2692f, 1.8039f, 19.2849f, 1.7662f)
                lineTo(19.303f, 1.7228f)
                lineTo(19.308f, 1.711f)
                lineTo(19.3094f, 1.7076f)
                lineTo(19.3099f, 1.7065f)
                curveTo(19.3099f, 1.7064f, 19.3101f, 1.7059f, 20.0f, 2.0002f)
                lineTo(19.3099f, 1.7065f)
                curveTo(19.4724f, 1.3255f, 19.9133f, 1.1478f, 20.2943f, 1.3103f)
                curveTo(20.6752f, 1.4728f, 20.8523f, 1.9134f, 20.6899f, 2.2943f)
                lineTo(20.6891f, 2.2963f)
                lineTo(20.6855f, 2.3047f)
                lineTo(20.6702f, 2.3414f)
                curveTo(20.6565f, 2.3743f, 20.6361f, 2.4241f, 20.6098f, 2.4894f)
                curveTo(20.5571f, 2.6201f, 20.4812f, 2.8128f, 20.3898f, 3.0567f)
                curveTo(20.2068f, 3.5449f, 19.9624f, 4.2365f, 19.718f, 5.0464f)
                curveTo(19.2254f, 6.6794f, 18.75f, 8.7395f, 18.75f, 10.5716f)
                curveTo(18.75f, 11.6305f, 19.1082f, 12.539f, 19.656f, 13.5279f)
                curveTo(19.8445f, 13.8681f, 20.0655f, 14.2317f, 20.3001f, 14.6177f)
                curveTo(20.8141f, 15.4631f, 21.393f, 16.4155f, 21.8363f, 17.462f)
                curveTo(22.3695f, 18.7206f, 22.75f, 20.1846f, 22.75f, 22.0002f)
                curveTo(22.75f, 22.4144f, 22.4142f, 22.7502f, 22.0f, 22.7502f)
                curveTo(21.5858f, 22.7502f, 21.25f, 22.4144f, 21.25f, 22.0002f)
                curveTo(21.25f, 20.5096f, 20.96f, 19.3045f, 20.5413f, 18.2564f)
                curveTo(15.1471f, 18.4033f, 13.0815f, 21.1273f, 12.7115f, 22.2374f)
                curveTo(12.6094f, 22.5436f, 12.3228f, 22.7502f, 12.0f, 22.7502f)
                curveTo(11.6772f, 22.7502f, 11.3906f, 22.5436f, 11.2885f, 22.2374f)
                curveTo(10.9185f, 21.1273f, 8.8529f, 18.4033f, 3.4587f, 18.2564f)
                curveTo(3.04f, 19.3045f, 2.75f, 20.5096f, 2.75f, 22.0002f)
                curveTo(2.75f, 22.4144f, 2.4142f, 22.7502f, 2.0f, 22.7502f)
                curveTo(1.5858f, 22.7502f, 1.25f, 22.4144f, 1.25f, 22.0002f)
                curveTo(1.25f, 20.1846f, 1.6305f, 18.7206f, 2.1637f, 17.462f)
                curveTo(2.607f, 16.4155f, 3.1859f, 15.4631f, 3.6999f, 14.6177f)
                curveTo(3.9345f, 14.2317f, 4.1555f, 13.8681f, 4.3439f, 13.5279f)
                curveTo(4.8918f, 12.539f, 5.25f, 11.6305f, 5.25f, 10.5716f)
                curveTo(5.25f, 8.7395f, 4.7746f, 6.6794f, 4.282f, 5.0464f)
                curveTo(4.0376f, 4.2365f, 3.7932f, 3.5449f, 3.6102f, 3.0567f)
                curveTo(3.5188f, 2.8128f, 3.4429f, 2.6201f, 3.3902f, 2.4894f)
                curveTo(3.3639f, 2.4241f, 3.3435f, 2.3743f, 3.3298f, 2.3414f)
                lineTo(3.3145f, 2.3047f)
                lineTo(3.3109f, 2.2963f)
                lineTo(3.3102f, 2.2945f)
                curveTo(3.1477f, 1.9136f, 3.3248f, 1.4728f, 3.7057f, 1.3103f)
                close()
                moveTo(4.1615f, 16.7878f)
                curveTo(8.3716f, 17.0665f, 10.8303f, 18.8419f, 12.0f, 20.4377f)
                curveTo(13.1697f, 18.8419f, 15.6284f, 17.0665f, 19.8385f, 16.7878f)
                curveTo(19.599f, 16.3533f, 19.3479f, 15.9416f, 19.0947f, 15.5265f)
                curveTo(18.8435f, 15.1147f, 18.5902f, 14.6994f, 18.3439f, 14.2548f)
                curveTo(18.2513f, 14.0877f, 18.1613f, 13.9184f, 18.0752f, 13.7465f)
                curveTo(18.0505f, 13.7489f, 18.0254f, 13.7502f, 18.0f, 13.7502f)
                horizontalLineTo(6.0f)
                curveTo(5.9746f, 13.7502f, 5.9495f, 13.7489f, 5.9248f, 13.7465f)
                curveTo(5.8387f, 13.9184f, 5.7487f, 14.0877f, 5.6561f, 14.2548f)
                curveTo(5.4098f, 14.6994f, 5.1565f, 15.1147f, 4.9053f, 15.5265f)
                curveTo(4.6521f, 15.9416f, 4.401f, 16.3533f, 4.1615f, 16.7878f)
                close()
                moveTo(6.5167f, 12.2502f)
                horizontalLineTo(17.4833f)
                curveTo(17.4377f, 12.0869f, 17.3978f, 11.9203f, 17.3645f, 11.7502f)
                horizontalLineTo(6.6355f)
                curveTo(6.6022f, 11.9203f, 6.5623f, 12.0869f, 6.5167f, 12.2502f)
                close()
            }
        }
            .build()
        return _bodyShape!!
    }

private var _bodyShape: ImageVector? = null
