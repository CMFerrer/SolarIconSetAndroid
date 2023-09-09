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

public val ShoppingEcommerceGroup.Bag5: ImageVector
    get() {
        if (_bag5 != null) {
            return _bag5!!
        }
        _bag5 = Builder(name = "Bag5", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.7942f, 14.9709f)
                curveTo(4.3313f, 17.6567f, 4.5999f, 18.9996f, 5.4874f, 19.8646f)
                curveTo(5.6514f, 20.0244f, 5.8289f, 20.1699f, 6.0178f, 20.2994f)
                curveTo(7.04f, 21.0f, 8.4095f, 21.0f, 11.1485f, 21.0f)
                horizontalLineTo(12.8515f)
                curveTo(15.5905f, 21.0f, 16.96f, 21.0f, 17.9822f, 20.2994f)
                curveTo(18.1711f, 20.1699f, 18.3486f, 20.0244f, 18.5126f, 19.8646f)
                curveTo(19.4001f, 18.9996f, 19.6687f, 17.6567f, 20.2058f, 14.9709f)
                curveTo(20.977f, 11.1149f, 21.3626f, 9.1869f, 20.475f, 7.8207f)
                curveTo(20.3142f, 7.5733f, 20.1266f, 7.3445f, 19.9156f, 7.1384f)
                curveTo(18.75f, 6.0f, 16.7838f, 6.0f, 12.8515f, 6.0f)
                horizontalLineTo(11.1485f)
                curveTo(7.2162f, 6.0f, 5.25f, 6.0f, 4.0844f, 7.1384f)
                curveTo(3.8734f, 7.3445f, 3.6858f, 7.5733f, 3.525f, 7.8207f)
                curveTo(2.6374f, 9.1869f, 3.023f, 11.1149f, 3.7942f, 14.9709f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 10.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 10.0f)
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
        return _bag5!!
    }

private var _bag5: ImageVector? = null
