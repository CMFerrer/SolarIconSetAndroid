package dev.chiksmedina.solar.linear.foodkitchen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.linear.FoodKitchenGroup

val FoodKitchenGroup.Whisk: ImageVector
    get() {
        if (_whisk != null) {
            return _whisk!!
        }
        _whisk = Builder(
            name = "Whisk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.8991f, 15.1272f)
                lineTo(6.8599f, 21.1662f)
                curveTo(5.7481f, 22.2779f, 3.9456f, 22.2779f, 2.8338f, 21.1662f)
                curveTo(1.7221f, 20.0545f, 1.7221f, 18.252f, 2.8338f, 17.1402f)
                lineTo(8.873f, 11.1013f)
                moveTo(20.5484f, 3.4515f)
                curveTo(21.7565f, 4.6596f, 19.0984f, 8.1229f, 17.3278f, 9.8934f)
                curveTo(15.5573f, 11.6638f, 11.2887f, 15.1271f, 10.0806f, 13.9191f)
                moveTo(20.5484f, 3.4515f)
                curveTo(19.3403f, 2.2435f, 15.8775f, 4.9021f, 14.1069f, 6.6726f)
                curveTo(12.3364f, 8.4431f, 8.8725f, 12.711f, 10.0806f, 13.9191f)
                moveTo(20.5484f, 3.4515f)
                curveTo(22.772f, 5.675f, 22.3733f, 9.6786f, 19.8158f, 12.236f)
                curveTo(17.2584f, 14.7934f, 12.3041f, 16.1425f, 10.0806f, 13.9191f)
                moveTo(20.5484f, 3.4515f)
                curveTo(18.3249f, 1.2281f, 14.3211f, 1.6267f, 11.7636f, 4.1841f)
                curveTo(9.2062f, 6.7414f, 7.857f, 11.6956f, 10.0806f, 13.9191f)
            }
        }
            .build()
        return _whisk!!
    }

private var _whisk: ImageVector? = null
