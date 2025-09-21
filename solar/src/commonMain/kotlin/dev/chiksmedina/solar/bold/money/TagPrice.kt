package dev.chiksmedina.solar.bold.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.MoneyGroup

val MoneyGroup.TagPrice: ImageVector
    get() {
        if (_tagPrice != null) {
            return _tagPrice!!
        }
        _tagPrice = Builder(
            name = "TagPrice", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(16.1369f, 4.7285f)
                lineTo(17.9665f, 6.5581f)
                curveTo(20.6555f, 9.2471f, 22.0f, 10.5916f, 22.0f, 12.2623f)
                curveTo(22.0f, 13.933f, 20.6555f, 15.2775f, 17.9665f, 17.9665f)
                curveTo(15.2775f, 20.6555f, 13.933f, 22.0f, 12.2623f, 22.0f)
                curveTo(10.5916f, 22.0f, 9.2471f, 20.6555f, 6.5581f, 17.9665f)
                lineTo(4.7285f, 16.1369f)
                curveTo(3.183f, 14.5914f, 2.4102f, 13.8186f, 2.1226f, 12.816f)
                curveTo(1.8351f, 11.8134f, 2.0808f, 10.7485f, 2.5723f, 8.6187f)
                lineTo(2.8557f, 7.3906f)
                curveTo(3.2692f, 5.5988f, 3.476f, 4.7029f, 4.0894f, 4.0894f)
                curveTo(4.7029f, 3.476f, 5.5988f, 3.2692f, 7.3906f, 2.8557f)
                lineTo(8.6187f, 2.5723f)
                curveTo(10.7485f, 2.0808f, 11.8134f, 1.8351f, 12.816f, 2.1226f)
                curveTo(13.8186f, 2.4102f, 14.5914f, 3.183f, 16.1369f, 4.7285f)
                close()
                moveTo(11.1467f, 14.3284f)
                curveTo(10.4737f, 13.6555f, 10.4794f, 12.6899f, 10.8819f, 11.9247f)
                curveTo(10.6807f, 11.6325f, 10.7101f, 11.2295f, 10.9699f, 10.9697f)
                curveTo(11.2288f, 10.7108f, 11.6298f, 10.6807f, 11.9217f, 10.8795f)
                curveTo(12.2615f, 10.6988f, 12.635f, 10.6033f, 13.0071f, 10.6068f)
                curveTo(13.4213f, 10.6107f, 13.7539f, 10.9497f, 13.75f, 11.3639f)
                curveTo(13.7461f, 11.7781f, 13.4071f, 12.1107f, 12.9929f, 12.1068f)
                curveTo(12.816f, 12.1051f, 12.5835f, 12.1845f, 12.3841f, 12.3839f)
                curveTo(11.9966f, 12.7714f, 12.0985f, 13.1589f, 12.2073f, 13.2678f)
                curveTo(12.3162f, 13.3766f, 12.7037f, 13.4785f, 13.0912f, 13.091f)
                curveTo(13.8753f, 12.307f, 15.2289f, 12.0467f, 16.0964f, 12.9142f)
                curveTo(16.7694f, 13.5872f, 16.7637f, 14.5528f, 16.3612f, 15.318f)
                curveTo(16.5624f, 15.6102f, 16.533f, 16.0132f, 16.2732f, 16.273f)
                curveTo(16.0143f, 16.5319f, 15.6131f, 16.5619f, 15.3212f, 16.3631f)
                curveTo(14.8643f, 16.6059f, 14.3446f, 16.6969f, 13.849f, 16.595f)
                curveTo(13.4433f, 16.5117f, 13.182f, 16.1152f, 13.2654f, 15.7094f)
                curveTo(13.3487f, 15.3037f, 13.7452f, 15.0424f, 14.151f, 15.1257f)
                curveTo(14.3281f, 15.1622f, 14.6137f, 15.104f, 14.859f, 14.8588f)
                curveTo(15.2465f, 14.4712f, 15.1446f, 14.0837f, 15.0358f, 13.9749f)
                curveTo(14.9269f, 13.866f, 14.5394f, 13.7641f, 14.1519f, 14.1517f)
                curveTo(13.3678f, 14.9357f, 12.0142f, 15.1959f, 11.1467f, 14.3284f)
                close()
                moveTo(10.021f, 10.2931f)
                curveTo(10.802f, 9.5121f, 10.802f, 8.2457f, 10.021f, 7.4647f)
                curveTo(9.2399f, 6.6836f, 7.9736f, 6.6836f, 7.1925f, 7.4647f)
                curveTo(6.4115f, 8.2457f, 6.4115f, 9.5121f, 7.1925f, 10.2931f)
                curveTo(7.9736f, 11.0742f, 9.2399f, 11.0742f, 10.021f, 10.2931f)
                close()
            }
        }
            .build()
        return _tagPrice!!
    }

private var _tagPrice: ImageVector? = null
