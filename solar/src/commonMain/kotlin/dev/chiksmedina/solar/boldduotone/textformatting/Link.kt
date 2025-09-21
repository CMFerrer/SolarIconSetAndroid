package dev.chiksmedina.solar.boldduotone.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.TextFormattingGroup

val TextFormattingGroup.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(
            name = "Link", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.7283f, 3.8841f)
                curveTo(17.1626f, 2.4442f, 19.2607f, 2.414f, 20.4221f, 3.5799f)
                curveTo(21.5858f, 4.7481f, 21.5545f, 6.8593f, 20.1192f, 8.3002f)
                lineTo(17.6953f, 10.7335f)
                curveTo(17.403f, 11.0269f, 17.4039f, 11.5018f, 17.6974f, 11.7941f)
                curveTo(17.9909f, 12.0864f, 18.4657f, 12.0855f, 18.758f, 11.7921f)
                lineTo(21.1819f, 9.3588f)
                curveTo(23.0932f, 7.4401f, 23.3331f, 4.3768f, 21.4849f, 2.5213f)
                curveTo(19.6344f, 0.6637f, 16.5779f, 0.9058f, 14.6656f, 2.8255f)
                lineTo(9.8179f, 7.6919f)
                curveTo(7.9066f, 9.6107f, 7.6667f, 12.674f, 9.5149f, 14.5295f)
                curveTo(9.8073f, 14.8229f, 10.2821f, 14.8238f, 10.5756f, 14.5315f)
                curveTo(10.8691f, 14.2392f, 10.87f, 13.7643f, 10.5777f, 13.4709f)
                curveTo(9.414f, 12.3027f, 9.4453f, 10.1914f, 10.8806f, 8.7505f)
                lineTo(15.7283f, 3.8841f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.4846f, 9.4707f)
                curveTo(14.1923f, 9.1772f, 13.7174f, 9.1763f, 13.4239f, 9.4686f)
                curveTo(13.1305f, 9.761f, 13.1296f, 10.2358f, 13.4219f, 10.5293f)
                curveTo(14.5856f, 11.6975f, 14.5542f, 13.8087f, 13.1189f, 15.2496f)
                lineTo(8.2713f, 20.1161f)
                curveTo(6.837f, 21.556f, 4.7389f, 21.5862f, 3.5774f, 20.4202f)
                curveTo(2.4138f, 19.2521f, 2.4451f, 17.1408f, 3.8804f, 15.6999f)
                lineTo(6.3042f, 13.2666f)
                curveTo(6.5966f, 12.9732f, 6.5957f, 12.4983f, 6.3022f, 12.206f)
                curveTo(6.0087f, 11.9137f, 5.5339f, 11.9146f, 5.2415f, 12.208f)
                lineTo(2.8177f, 14.6413f)
                curveTo(0.9064f, 16.56f, 0.6664f, 19.6234f, 2.5147f, 21.4788f)
                curveTo(4.3652f, 23.3365f, 7.4217f, 23.0944f, 9.334f, 21.1747f)
                lineTo(14.1816f, 16.3082f)
                curveTo(16.0929f, 14.3895f, 16.3329f, 11.3262f, 14.4846f, 9.4707f)
                close()
            }
        }
            .build()
        return _link!!
    }

private var _link: ImageVector? = null
