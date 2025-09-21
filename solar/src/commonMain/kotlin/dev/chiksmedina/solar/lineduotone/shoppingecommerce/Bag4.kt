package dev.chiksmedina.solar.lineduotone.shoppingecommerce

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
import dev.chiksmedina.solar.lineduotone.ShoppingEcommerceGroup

val ShoppingEcommerceGroup.Bag4: ImageVector
    get() {
        if (_bag4 != null) {
            return _bag4!!
        }
        _bag4 = Builder(
            name = "Bag4", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.7941f, 12.0291f)
                curveTo(4.3313f, 9.3433f, 4.5999f, 8.0004f, 5.4873f, 7.1354f)
                curveTo(5.6514f, 6.9756f, 5.8288f, 6.8301f, 6.0177f, 6.7006f)
                curveTo(7.0399f, 6.0f, 8.4094f, 6.0f, 11.1485f, 6.0f)
                horizontalLineTo(12.8514f)
                curveTo(15.5904f, 6.0f, 16.96f, 6.0f, 17.9821f, 6.7006f)
                curveTo(18.1711f, 6.8301f, 18.3485f, 6.9756f, 18.5125f, 7.1354f)
                curveTo(19.4f, 8.0004f, 19.6686f, 9.3433f, 20.2058f, 12.0291f)
                curveTo(20.977f, 15.8851f, 21.3626f, 17.8131f, 20.4749f, 19.1793f)
                curveTo(20.3142f, 19.4267f, 20.1266f, 19.6555f, 19.9155f, 19.8616f)
                curveTo(18.75f, 21.0f, 16.7838f, 21.0f, 12.8514f, 21.0f)
                horizontalLineTo(11.1485f)
                curveTo(7.2161f, 21.0f, 5.2499f, 21.0f, 4.0843f, 19.8616f)
                curveTo(3.8733f, 19.6555f, 3.6857f, 19.4267f, 3.525f, 19.1793f)
                curveTo(2.6373f, 17.8131f, 3.0229f, 15.8851f, 3.7941f, 12.0291f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.0f, 9.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 9.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 6.0f)
                verticalLineTo(5.0f)
                curveTo(9.0f, 3.3431f, 10.3431f, 2.0f, 12.0f, 2.0f)
                curveTo(13.6569f, 2.0f, 15.0f, 3.3431f, 15.0f, 5.0f)
                verticalLineTo(6.0f)
            }
        }
            .build()
        return _bag4!!
    }

private var _bag4: ImageVector? = null
