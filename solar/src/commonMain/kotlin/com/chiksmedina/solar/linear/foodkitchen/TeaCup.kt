package com.chiksmedina.solar.linear.foodkitchen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.FoodKitchenGroup

val FoodKitchenGroup.TeaCup: ImageVector
    get() {
        if (_teaCup != null) {
            return _teaCup!!
        }
        _teaCup = Builder(
            name = "TeaCup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.3153f, 12.6978f)
                curveTo(2.2654f, 12.2706f, 2.2404f, 12.057f, 2.2509f, 11.8809f)
                curveTo(2.306f, 10.9577f, 2.9868f, 10.1928f, 3.8972f, 10.0309f)
                curveTo(4.0709f, 10.0f, 4.286f, 10.0f, 4.7161f, 10.0f)
                horizontalLineTo(15.2838f)
                curveTo(15.7139f, 10.0f, 15.929f, 10.0f, 16.1027f, 10.0309f)
                curveTo(17.0132f, 10.1928f, 17.694f, 10.9577f, 17.749f, 11.8809f)
                curveTo(17.7595f, 12.057f, 17.7346f, 12.2706f, 17.6846f, 12.6978f)
                lineTo(17.284f, 16.1258f)
                curveTo(17.1031f, 17.6729f, 16.2764f, 19.0714f, 15.0081f, 19.9757f)
                curveTo(14.0736f, 20.6419f, 12.9546f, 21.0f, 11.8069f, 21.0f)
                horizontalLineTo(8.193f)
                curveTo(7.0454f, 21.0f, 5.9263f, 20.6419f, 4.9918f, 19.9757f)
                curveTo(3.7235f, 19.0714f, 2.8968f, 17.6729f, 2.716f, 16.1258f)
                lineTo(2.3153f, 12.6978f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.0f, 17.0f)
                horizontalLineTo(19.0f)
                curveTo(20.6569f, 17.0f, 22.0f, 15.6569f, 22.0f, 14.0f)
                curveTo(22.0f, 12.3431f, 20.6569f, 11.0f, 19.0f, 11.0f)
                horizontalLineTo(17.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0002f, 2.0f)
                curveTo(9.4479f, 2.5523f, 9.4479f, 3.4477f, 10.0002f, 4.0f)
                curveTo(10.5524f, 4.5523f, 10.5524f, 5.4477f, 10.0002f, 6.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.0f, 7.5f)
                lineTo(5.1161f, 7.3839f)
                curveTo(5.6233f, 6.8767f, 5.6803f, 6.0738f, 5.25f, 5.5f)
                curveTo(4.8197f, 4.9262f, 4.8767f, 4.1233f, 5.3839f, 3.6161f)
                lineTo(5.5f, 3.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.5f, 7.5f)
                lineTo(14.6161f, 7.3839f)
                curveTo(15.1233f, 6.8767f, 15.1803f, 6.0738f, 14.75f, 5.5f)
                curveTo(14.3197f, 4.9262f, 14.3767f, 4.1233f, 14.8839f, 3.6161f)
                lineTo(15.0f, 3.5f)
            }
        }
            .build()
        return _teaCup!!
    }

private var _teaCup: ImageVector? = null
