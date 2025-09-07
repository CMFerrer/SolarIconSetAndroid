package com.chiksmedina.solar.linear.shoppingecommerce

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
import com.chiksmedina.solar.linear.ShoppingEcommerceGroup

val ShoppingEcommerceGroup.BagMusic: ImageVector
    get() {
        if (_bagMusic != null) {
            return _bagMusic!!
        }
        _bagMusic = Builder(
            name = "BagMusic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
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
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 6.0f)
                verticalLineTo(5.0f)
                curveTo(9.0f, 3.3431f, 10.3431f, 2.0f, 12.0f, 2.0f)
                curveTo(13.6569f, 2.0f, 15.0f, 3.3431f, 15.0f, 5.0f)
                verticalLineTo(6.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 17.0f)
                curveTo(12.0f, 18.1046f, 11.1046f, 19.0f, 10.0f, 19.0f)
                curveTo(8.8954f, 19.0f, 8.0f, 18.1046f, 8.0f, 17.0f)
                curveTo(8.0f, 15.8954f, 8.8954f, 15.0f, 10.0f, 15.0f)
                curveTo(11.1046f, 15.0f, 12.0f, 15.8954f, 12.0f, 17.0f)
                close()
                moveTo(12.0f, 17.0f)
                verticalLineTo(12.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.0584f, 9.971f)
                lineTo(12.7416f, 10.6294f)
                curveTo(12.5592f, 10.7206f, 12.468f, 10.7662f, 12.3926f, 10.8238f)
                curveTo(12.1974f, 10.973f, 12.064f, 11.1889f, 12.0178f, 11.4302f)
                curveTo(12.0f, 11.5234f, 12.0f, 11.6254f, 12.0f, 11.8294f)
                curveTo(12.0f, 12.3149f, 12.0f, 12.5577f, 12.0598f, 12.7227f)
                curveTo(12.2178f, 13.1589f, 12.6551f, 13.4292f, 13.1159f, 13.3754f)
                curveTo(13.2902f, 13.3551f, 13.5074f, 13.2465f, 13.9416f, 13.0294f)
                lineTo(15.2584f, 12.371f)
                curveTo(15.4408f, 12.2798f, 15.532f, 12.2342f, 15.6074f, 12.1765f)
                curveTo(15.8026f, 12.0273f, 15.936f, 11.8115f, 15.9822f, 11.5701f)
                curveTo(16.0f, 11.477f, 16.0f, 11.375f, 16.0f, 11.171f)
                curveTo(16.0f, 10.6855f, 16.0f, 10.4427f, 15.9402f, 10.2776f)
                curveTo(15.7822f, 9.8414f, 15.3449f, 9.5712f, 14.8841f, 9.625f)
                curveTo(14.7098f, 9.6453f, 14.4926f, 9.7538f, 14.0584f, 9.971f)
                close()
            }
        }
            .build()
        return _bagMusic!!
    }

private var _bagMusic: ImageVector? = null
