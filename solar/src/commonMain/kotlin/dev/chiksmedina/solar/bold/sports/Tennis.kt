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

val SportsGroup.Tennis: ImageVector
    get() {
        if (_tennis != null) {
            return _tennis!!
        }
        _tennis = Builder(
            name = "Tennis", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.6881f, 16.5079f)
                curveTo(20.5832f, 16.4493f, 20.435f, 16.3627f, 20.2514f, 16.246f)
                curveTo(19.8844f, 16.0126f, 19.3751f, 15.6581f, 18.787f, 15.1643f)
                curveTo(17.6106f, 14.1765f, 16.1165f, 12.6292f, 14.816f, 10.3767f)
                curveTo(13.5156f, 8.1243f, 12.9226f, 6.0566f, 12.6553f, 4.544f)
                curveTo(12.5217f, 3.7877f, 12.4694f, 3.1695f, 12.4508f, 2.7349f)
                curveTo(12.4415f, 2.5176f, 12.4406f, 2.346f, 12.4422f, 2.2258f)
                curveTo(12.4431f, 2.1657f, 12.4495f, 2.0443f, 12.4508f, 2.0105f)
                curveTo(10.6072f, 1.9259f, 8.7186f, 2.3502f, 7.0017f, 3.3414f)
                curveTo(5.2858f, 4.3321f, 3.9746f, 5.7545f, 3.126f, 7.3922f)
                lineTo(3.3149f, 7.4955f)
                curveTo(3.4198f, 7.5542f, 3.568f, 7.6407f, 3.7515f, 7.7574f)
                curveTo(4.1185f, 7.9908f, 4.6278f, 8.3453f, 5.2159f, 8.8391f)
                curveTo(6.3923f, 9.8269f, 7.8864f, 11.3743f, 9.1869f, 13.6267f)
                curveTo(10.4873f, 15.8792f, 11.0803f, 17.9468f, 11.3476f, 19.4594f)
                curveTo(11.4812f, 20.2157f, 11.5335f, 20.834f, 11.5521f, 21.2685f)
                curveTo(11.5614f, 21.4858f, 11.5623f, 21.6575f, 11.5607f, 21.7777f)
                verticalLineTo(21.9932f)
                curveTo(13.4017f, 22.0762f, 15.2873f, 21.6517f, 17.0017f, 20.6619f)
                curveTo(18.7158f, 19.6723f, 20.0261f, 18.2518f, 20.8747f, 16.6162f)
                lineTo(20.6881f, 16.5079f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.0598f, 21.8114f)
                curveTo(10.0611f, 21.7179f, 10.0615f, 21.5204f, 10.0535f, 21.3327f)
                curveTo(10.0374f, 20.9572f, 9.9914f, 20.4051f, 9.8705f, 19.7204f)
                curveTo(9.6285f, 18.3512f, 9.0874f, 16.4544f, 7.8878f, 14.3767f)
                curveTo(6.6883f, 12.299f, 5.3162f, 10.882f, 4.2514f, 9.9879f)
                curveTo(3.7189f, 9.5408f, 3.2638f, 9.2249f, 2.9466f, 9.0232f)
                curveTo(2.7881f, 8.9224f, 2.6169f, 8.8241f, 2.5352f, 8.7784f)
                curveTo(1.6397f, 11.4119f, 1.8413f, 14.4035f, 3.3414f, 17.0017f)
                curveTo(4.8415f, 19.5998f, 7.3314f, 21.2702f, 10.0598f, 21.8114f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.9431f, 2.1918f)
                curveTo(13.9419f, 2.2853f, 13.9414f, 2.4831f, 13.9494f, 2.6707f)
                curveTo(13.9655f, 3.0463f, 14.0115f, 3.5983f, 14.1325f, 4.283f)
                curveTo(14.3744f, 5.6523f, 14.9155f, 7.549f, 16.1151f, 9.6267f)
                curveTo(17.3146f, 11.7044f, 18.6867f, 13.1214f, 19.7516f, 14.0156f)
                curveTo(20.284f, 14.4627f, 20.7391f, 14.7785f, 21.0563f, 14.9802f)
                curveTo(21.2148f, 15.081f, 21.3864f, 15.1795f, 21.468f, 15.2252f)
                curveTo(22.3636f, 12.5916f, 22.162f, 9.5999f, 20.6619f, 7.0017f)
                curveTo(19.1618f, 4.4034f, 16.6717f, 2.733f, 13.9431f, 2.1918f)
                close()
            }
        }
            .build()
        return _tennis!!
    }

private var _tennis: ImageVector? = null
