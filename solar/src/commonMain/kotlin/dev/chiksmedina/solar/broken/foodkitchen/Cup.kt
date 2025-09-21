package dev.chiksmedina.solar.broken.foodkitchen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.FoodKitchenGroup

val FoodKitchenGroup.Cup: ImageVector
    get() {
        if (_cup != null) {
            return _cup!!
        }
        _cup = Builder(
            name = "Cup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
            = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.0f, 7.0f)
                curveTo(3.0f, 5.1144f, 3.0f, 4.1716f, 3.5858f, 3.5858f)
                curveTo(4.1716f, 3.0f, 5.1144f, 3.0f, 7.0f, 3.0f)
                horizontalLineTo(13.0f)
                curveTo(14.8856f, 3.0f, 15.8284f, 3.0f, 16.4142f, 3.5858f)
                curveTo(17.0f, 4.1716f, 17.0f, 5.1144f, 17.0f, 7.0f)
                verticalLineTo(12.0f)
                curveTo(17.0f, 14.8284f, 17.0f, 16.2426f, 16.1213f, 17.1213f)
                curveTo(15.2426f, 18.0f, 13.8284f, 18.0f, 11.0f, 18.0f)
                horizontalLineTo(9.0f)
                curveTo(6.1716f, 18.0f, 4.7574f, 18.0f, 3.8787f, 17.1213f)
                curveTo(3.0f, 16.2426f, 3.0f, 14.8284f, 3.0f, 12.0f)
                verticalLineTo(11.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.0f, 13.0f)
                horizontalLineTo(18.0f)
                curveTo(20.2091f, 13.0f, 22.0f, 11.2091f, 22.0f, 9.0f)
                curveTo(22.0f, 6.7909f, 20.2091f, 5.0f, 18.0f, 5.0f)
                horizontalLineTo(17.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.0f, 13.0f)
                horizontalLineTo(14.0f)
                moveTo(3.0f, 13.0f)
                horizontalLineTo(10.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 21.0f)
                lineTo(2.0f, 21.0f)
            }
        }
            .build()
        return _cup!!
    }

private var _cup: ImageVector? = null
