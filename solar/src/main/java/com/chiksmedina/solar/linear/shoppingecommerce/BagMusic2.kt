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

public val ShoppingEcommerceGroup.BagMusic2: ImageVector
    get() {
        if (_bagMusic2 != null) {
            return _bagMusic2!!
        }
        _bagMusic2 = Builder(name = "BagMusic2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.7417f, 20.5545f)
                curveTo(4.9413f, 22.0f, 7.174f, 22.0f, 11.6394f, 22.0f)
                horizontalLineTo(12.3606f)
                curveTo(16.826f, 22.0f, 19.0587f, 22.0f, 20.2584f, 20.5545f)
                moveTo(3.7417f, 20.5545f)
                curveTo(2.5421f, 19.1091f, 2.9535f, 16.9146f, 3.7764f, 12.5257f)
                curveTo(4.3617f, 9.4045f, 4.6543f, 7.8439f, 5.7652f, 6.922f)
                moveTo(3.7417f, 20.5545f)
                curveTo(3.7417f, 20.5545f, 3.7417f, 20.5545f, 3.7417f, 20.5545f)
                close()
                moveTo(20.2584f, 20.5545f)
                curveTo(21.458f, 19.1091f, 21.0465f, 16.9146f, 20.2236f, 12.5257f)
                curveTo(19.6384f, 9.4045f, 19.3458f, 7.8439f, 18.2349f, 6.922f)
                moveTo(20.2584f, 20.5545f)
                curveTo(20.2583f, 20.5545f, 20.2584f, 20.5545f, 20.2584f, 20.5545f)
                close()
                moveTo(18.2349f, 6.922f)
                curveTo(17.124f, 6.0f, 15.5362f, 6.0f, 12.3606f, 6.0f)
                horizontalLineTo(11.6394f)
                curveTo(8.4639f, 6.0f, 6.8761f, 6.0f, 5.7652f, 6.922f)
                moveTo(18.2349f, 6.922f)
                curveTo(18.2349f, 6.922f, 18.2349f, 6.922f, 18.2349f, 6.922f)
                close()
                moveTo(5.7652f, 6.922f)
                curveTo(5.7652f, 6.922f, 5.7652f, 6.922f, 5.7652f, 6.922f)
                close()
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
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 16.0f)
                verticalLineTo(13.0f)
                verticalLineTo(10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 16.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 12.0f)
                curveTo(13.8954f, 12.0f, 13.0f, 11.1046f, 13.0f, 10.0f)
            }
        }
        .build()
        return _bagMusic2!!
    }

private var _bagMusic2: ImageVector? = null
