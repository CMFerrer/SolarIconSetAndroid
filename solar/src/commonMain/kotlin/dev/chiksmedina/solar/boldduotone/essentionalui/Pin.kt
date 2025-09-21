package dev.chiksmedina.solar.boldduotone.essentionalui

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
import dev.chiksmedina.solar.boldduotone.EssentionalUiGroup

val EssentionalUiGroup.Pin: ImageVector
    get() {
        if (_pin != null) {
            return _pin!!
        }
        _pin = Builder(
            name = "Pin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
            = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(16.2188f, 4.8376f)
                lineTo(19.1835f, 7.8052f)
                curveTo(21.1954f, 9.819f, 22.2014f, 10.826f, 21.9667f, 11.9115f)
                curveTo(21.7319f, 12.9969f, 20.4f, 13.4973f, 17.7362f, 14.4981f)
                lineTo(15.8922f, 15.191f)
                curveTo(15.1788f, 15.459f, 14.8221f, 15.593f, 14.5468f, 15.8314f)
                curveTo(14.4262f, 15.9358f, 14.3184f, 16.054f, 14.2254f, 16.1835f)
                curveTo(14.013f, 16.4795f, 13.9119f, 16.8472f, 13.7095f, 17.5825f)
                curveTo(13.2493f, 19.2551f, 13.0192f, 20.0914f, 12.4713f, 20.4041f)
                curveTo(12.2404f, 20.5358f, 11.9792f, 20.6049f, 11.7134f, 20.6045f)
                curveTo(11.0827f, 20.6036f, 10.4699f, 19.9902f, 9.2444f, 18.7635f)
                lineTo(7.7784f, 17.2961f)
                lineTo(6.6993f, 16.2163f)
                lineTo(5.2848f, 14.8f)
                curveTo(4.067f, 13.581f, 3.4581f, 12.9715f, 3.4541f, 12.3446f)
                curveTo(3.4524f, 12.0735f, 3.5228f, 11.8069f, 3.658f, 11.5721f)
                curveTo(3.9709f, 11.0289f, 4.8011f, 10.8f, 6.4615f, 10.3423f)
                curveTo(7.1981f, 10.1392f, 7.5664f, 10.0377f, 7.8625f, 9.8245f)
                curveTo(7.9954f, 9.7289f, 8.1162f, 9.6175f, 8.2224f, 9.4929f)
                curveTo(8.4591f, 9.2152f, 8.5906f, 8.8562f, 8.8537f, 8.1381f)
                lineTo(9.5217f, 6.3151f)
                curveTo(10.5086f, 3.6216f, 11.0021f, 2.2748f, 12.0904f, 2.0347f)
                curveTo(13.1788f, 1.7946f, 14.1921f, 2.8089f, 16.2188f, 4.8376f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.3024f, 21.7764f)
                lineTo(7.7784f, 17.2961f)
                lineTo(6.6993f, 16.2163f)
                lineTo(2.2234f, 20.6965f)
                curveTo(1.9255f, 20.9947f, 1.9255f, 21.4782f, 2.2234f, 21.7764f)
                curveTo(2.5214f, 22.0747f, 3.0044f, 22.0747f, 3.3024f, 21.7764f)
                close()
            }
        }
            .build()
        return _pin!!
    }

private var _pin: ImageVector? = null
