package com.chiksmedina.solar.linear.shoppingecommerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.ShoppingEcommerceGroup

public val ShoppingEcommerceGroup.Bag4: ImageVector
    get() {
        if (_bag4 != null) {
            return _bag4!!
        }
        _bag4 = Builder(name = "Bag4", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.7942f, 12.0291f)
                curveTo(4.3313f, 9.3433f, 4.5999f, 8.0004f, 5.4874f, 7.1354f)
                curveTo(5.6514f, 6.9756f, 5.8289f, 6.8301f, 6.0178f, 6.7006f)
                curveTo(7.04f, 6.0f, 8.4095f, 6.0f, 11.1485f, 6.0f)
                horizontalLineTo(12.8515f)
                curveTo(15.5905f, 6.0f, 16.96f, 6.0f, 17.9822f, 6.7006f)
                curveTo(18.1711f, 6.8301f, 18.3486f, 6.9756f, 18.5126f, 7.1354f)
                curveTo(19.4001f, 8.0004f, 19.6687f, 9.3433f, 20.2058f, 12.0291f)
                curveTo(20.977f, 15.8851f, 21.3626f, 17.8131f, 20.475f, 19.1793f)
                curveTo(20.3142f, 19.4267f, 20.1266f, 19.6555f, 19.9156f, 19.8616f)
                curveTo(18.75f, 21.0f, 16.7838f, 21.0f, 12.8515f, 21.0f)
                horizontalLineTo(11.1485f)
                curveTo(7.2162f, 21.0f, 5.25f, 21.0f, 4.0844f, 19.8616f)
                curveTo(3.8734f, 19.6555f, 3.6858f, 19.4267f, 3.525f, 19.1793f)
                curveTo(2.6374f, 17.8131f, 3.023f, 15.8851f, 3.7942f, 12.0291f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 9.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 9.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
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
