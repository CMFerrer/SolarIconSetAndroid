package dev.chiksmedina.solar.boldduotone.naturetravel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.NatureTravelGroup

val NatureTravelGroup.Bonfire: ImageVector
    get() {
        if (_bonfire != null) {
            return _bonfire!!
        }
        _bonfire = Builder(
            name = "Bonfire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(3.3131f, 14.6996f)
                curveTo(3.4791f, 14.3201f, 3.9213f, 14.147f, 4.3008f, 14.3131f)
                lineTo(9.3008f, 16.5006f)
                curveTo(9.6803f, 16.6666f, 9.8533f, 17.1088f, 9.6873f, 17.4883f)
                curveTo(9.5213f, 17.8678f, 9.0791f, 18.0408f, 8.6996f, 17.8748f)
                lineTo(3.6996f, 15.6873f)
                curveTo(3.3201f, 15.5213f, 3.147f, 15.0791f, 3.3131f, 14.6996f)
                close()
                moveTo(20.6873f, 14.6996f)
                curveTo(20.8533f, 15.0791f, 20.6803f, 15.5213f, 20.3008f, 15.6873f)
                lineTo(4.3008f, 22.6873f)
                curveTo(3.9213f, 22.8533f, 3.4791f, 22.6803f, 3.3131f, 22.3008f)
                curveTo(3.147f, 21.9213f, 3.3201f, 21.4791f, 3.6996f, 21.3131f)
                lineTo(19.6996f, 14.3131f)
                curveTo(20.0791f, 14.147f, 20.5213f, 14.3201f, 20.6873f, 14.6996f)
                close()
                moveTo(13.8131f, 19.2933f)
                curveTo(13.9791f, 18.9138f, 14.4213f, 18.7408f, 14.8008f, 18.9068f)
                lineTo(20.3008f, 21.3131f)
                curveTo(20.6803f, 21.4791f, 20.8533f, 21.9213f, 20.6873f, 22.3008f)
                curveTo(20.5213f, 22.6803f, 20.0791f, 22.8533f, 19.6996f, 22.6873f)
                lineTo(14.1996f, 20.2811f)
                curveTo(13.8201f, 20.115f, 13.647f, 19.6728f, 13.8131f, 19.2933f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.6f, 15.0f)
                curveTo(13.7333f, 15.0f, 18.0f, 13.7615f, 18.0f, 8.8075f)
                curveTo(18.0f, 5.776f, 16.1512f, 3.5774f, 14.4009f, 2.2646f)
                curveTo(13.503f, 1.5911f, 12.3529f, 2.2896f, 12.3529f, 3.389f)
                curveTo(12.3529f, 4.1317f, 12.1424f, 5.3661f, 11.5596f, 6.28f)
                curveTo(10.8777f, 7.3494f, 9.7513f, 6.421f, 9.573f, 5.1762f)
                curveTo(9.4835f, 4.552f, 8.7964f, 4.2939f, 8.261f, 4.6527f)
                curveTo(7.2084f, 5.3583f, 6.0f, 6.7102f, 6.0f, 8.8075f)
                curveTo(6.0f, 13.7615f, 9.7333f, 15.0f, 11.6f, 15.0f)
                close()
                moveTo(15.2155f, 9.2816f)
                curveTo(15.6123f, 9.4007f, 15.8374f, 9.8188f, 15.7184f, 10.2155f)
                curveTo(15.4495f, 11.1119f, 14.3344f, 12.75f, 12.0f, 12.75f)
                curveTo(11.5858f, 12.75f, 11.25f, 12.4142f, 11.25f, 12.0f)
                curveTo(11.25f, 11.5858f, 11.5858f, 11.25f, 12.0f, 11.25f)
                curveTo(13.5056f, 11.25f, 14.1505f, 10.2215f, 14.2816f, 9.7845f)
                curveTo(14.4007f, 9.3877f, 14.8188f, 9.1626f, 15.2155f, 9.2816f)
                close()
            }
        }
            .build()
        return _bonfire!!
    }

private var _bonfire: ImageVector? = null
