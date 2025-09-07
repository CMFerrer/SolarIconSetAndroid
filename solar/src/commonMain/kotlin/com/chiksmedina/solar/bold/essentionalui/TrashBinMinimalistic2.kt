package com.chiksmedina.solar.bold.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.EssentionalUiGroup

val EssentionalUiGroup.TrashBinMinimalistic2: ImageVector
    get() {
        if (_trashBinMinimalistic2 != null) {
            return _trashBinMinimalistic2!!
        }
        _trashBinMinimalistic2 = Builder(
            name = "TrashBinMinimalistic2", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.0f, 6.5238f)
                curveTo(3.0f, 6.1293f, 3.3267f, 5.8095f, 3.7297f, 5.8095f)
                horizontalLineTo(8.5179f)
                curveTo(8.5244f, 4.9683f, 8.6155f, 3.815f, 9.4504f, 3.0167f)
                curveTo(10.1074f, 2.3884f, 11.0081f, 2.0f, 12.0f, 2.0f)
                curveTo(12.9919f, 2.0f, 13.8926f, 2.3884f, 14.5496f, 3.0167f)
                curveTo(15.3844f, 3.815f, 15.4756f, 4.9683f, 15.4821f, 5.8095f)
                horizontalLineTo(20.2703f)
                curveTo(20.6733f, 5.8095f, 21.0f, 6.1293f, 21.0f, 6.5238f)
                curveTo(21.0f, 6.9183f, 20.6733f, 7.2381f, 20.2703f, 7.2381f)
                horizontalLineTo(3.7297f)
                curveTo(3.3267f, 7.2381f, 3.0f, 6.9183f, 3.0f, 6.5238f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.6066f, 22.0f)
                horizontalLineTo(12.3935f)
                curveTo(15.101f, 22.0f, 16.4547f, 22.0f, 17.3349f, 21.1368f)
                curveTo(18.2151f, 20.2736f, 18.3052f, 18.8576f, 18.4853f, 16.0257f)
                lineTo(18.7448f, 11.9452f)
                curveTo(18.8425f, 10.4086f, 18.8913f, 9.6404f, 18.4498f, 9.1535f)
                curveTo(18.0082f, 8.6667f, 17.2625f, 8.6667f, 15.7712f, 8.6667f)
                horizontalLineTo(8.2288f)
                curveTo(6.7375f, 8.6667f, 5.9918f, 8.6667f, 5.5503f, 9.1535f)
                curveTo(5.1087f, 9.6404f, 5.1576f, 10.4086f, 5.2553f, 11.9452f)
                lineTo(5.5148f, 16.0257f)
                curveTo(5.6949f, 18.8576f, 5.7849f, 20.2736f, 6.6651f, 21.1368f)
                curveTo(7.5453f, 22.0f, 8.8991f, 22.0f, 11.6066f, 22.0f)
                close()
            }
        }
            .build()
        return _trashBinMinimalistic2!!
    }

private var _trashBinMinimalistic2: ImageVector? = null
