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

public val ShoppingEcommerceGroup.Shop2: ImageVector
    get() {
        if (_shop2 != null) {
            return _shop2!!
        }
        _shop2 = Builder(name = "Shop2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 22.0f)
                horizontalLineTo(2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 22.0f)
                verticalLineTo(11.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 22.0f)
                verticalLineTo(11.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.5279f, 2.0f)
                horizontalLineTo(7.4722f)
                curveTo(6.2694f, 2.0f, 5.668f, 2.0f, 5.1847f, 2.2987f)
                curveTo(4.7014f, 2.5974f, 4.4324f, 3.1353f, 3.8945f, 4.2111f)
                lineTo(2.4909f, 7.7593f)
                curveTo(2.1666f, 8.5791f, 1.8829f, 9.5452f, 2.4288f, 10.2375f)
                curveTo(2.795f, 10.7019f, 3.3627f, 11.0f, 4.0f, 11.0f)
                curveTo(5.1046f, 11.0f, 6.0f, 10.1046f, 6.0f, 9.0f)
                curveTo(6.0f, 10.1046f, 6.8954f, 11.0f, 8.0f, 11.0f)
                curveTo(9.1046f, 11.0f, 10.0f, 10.1046f, 10.0f, 9.0f)
                curveTo(10.0f, 10.1046f, 10.8954f, 11.0f, 12.0f, 11.0f)
                curveTo(13.1046f, 11.0f, 14.0f, 10.1046f, 14.0f, 9.0f)
                curveTo(14.0f, 10.1046f, 14.8954f, 11.0f, 16.0f, 11.0f)
                curveTo(17.1046f, 11.0f, 18.0f, 10.1046f, 18.0f, 9.0f)
                curveTo(18.0f, 10.1046f, 18.8954f, 11.0f, 20.0f, 11.0f)
                curveTo(20.6374f, 11.0f, 21.2051f, 10.7019f, 21.5713f, 10.2375f)
                curveTo(22.1172f, 9.5452f, 21.8335f, 8.5791f, 21.5092f, 7.7593f)
                lineTo(20.1056f, 4.2111f)
                curveTo(19.5677f, 3.1353f, 19.2987f, 2.5974f, 18.8154f, 2.2987f)
                curveTo(18.3321f, 2.0f, 17.7307f, 2.0f, 16.5279f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.5f, 21.5f)
                verticalLineTo(18.5f)
                curveTo(9.5f, 17.5654f, 9.5f, 17.0981f, 9.701f, 16.75f)
                curveTo(9.8326f, 16.522f, 10.022f, 16.3326f, 10.25f, 16.201f)
                curveTo(10.5981f, 16.0f, 11.0654f, 16.0f, 12.0f, 16.0f)
                curveTo(12.9346f, 16.0f, 13.4019f, 16.0f, 13.75f, 16.201f)
                curveTo(13.978f, 16.3326f, 14.1674f, 16.522f, 14.299f, 16.75f)
                curveTo(14.5f, 17.0981f, 14.5f, 17.5654f, 14.5f, 18.5f)
                verticalLineTo(21.5f)
            }
        }
        .build()
        return _shop2!!
    }

private var _shop2: ImageVector? = null
