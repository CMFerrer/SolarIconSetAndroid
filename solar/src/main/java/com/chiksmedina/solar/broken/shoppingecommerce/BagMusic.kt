package com.chiksmedina.solar.broken.shoppingecommerce

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
import com.chiksmedina.solar.broken.ShoppingEcommerceGroup

public val ShoppingEcommerceGroup.BagMusic: ImageVector
    get() {
        if (_bagMusic != null) {
            return _bagMusic!!
        }
        _bagMusic = Builder(name = "BagMusic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 17.0f)
                curveTo(12.0f, 18.1046f, 11.1046f, 19.0f, 10.0f, 19.0f)
                curveTo(8.8954f, 19.0f, 8.0f, 18.1046f, 8.0f, 17.0f)
                curveTo(8.0f, 15.8954f, 8.8954f, 15.0f, 10.0f, 15.0f)
                curveTo(11.1046f, 15.0f, 12.0f, 15.8954f, 12.0f, 17.0f)
                close()
                moveTo(12.0f, 17.0f)
                verticalLineTo(12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0584f, 9.9708f)
                lineTo(12.7416f, 10.6292f)
                lineTo(12.7416f, 10.6292f)
                curveTo(12.5592f, 10.7204f, 12.468f, 10.766f, 12.3926f, 10.8236f)
                curveTo(12.1974f, 10.9729f, 12.064f, 11.1887f, 12.0178f, 11.43f)
                curveTo(12.0f, 11.5232f, 12.0f, 11.6252f, 12.0f, 11.8292f)
                curveTo(12.0f, 12.3147f, 12.0f, 12.5575f, 12.0598f, 12.7225f)
                curveTo(12.2178f, 13.1587f, 12.6551f, 13.429f, 13.1159f, 13.3752f)
                curveTo(13.2902f, 13.3549f, 13.5074f, 13.2463f, 13.9416f, 13.0292f)
                lineTo(15.2584f, 12.3708f)
                curveTo(15.4408f, 12.2796f, 15.532f, 12.234f, 15.6074f, 12.1764f)
                curveTo(15.8026f, 12.0271f, 15.936f, 11.8113f, 15.9822f, 11.57f)
                curveTo(16.0f, 11.4768f, 16.0f, 11.3748f, 16.0f, 11.1708f)
                curveTo(16.0f, 10.6853f, 16.0f, 10.4425f, 15.9402f, 10.2775f)
                curveTo(15.7822f, 9.8413f, 15.3449f, 9.571f, 14.8841f, 9.6248f)
                curveTo(14.7098f, 9.6451f, 14.4926f, 9.7537f, 14.0584f, 9.9708f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.2235f, 12.5257f)
                curveTo(19.6382f, 9.4045f, 19.3456f, 7.8439f, 18.2347f, 6.922f)
                curveTo(17.1238f, 6.0f, 15.5361f, 6.0f, 12.3605f, 6.0f)
                horizontalLineTo(11.6393f)
                curveTo(8.4637f, 6.0f, 6.876f, 6.0f, 5.7651f, 6.922f)
                curveTo(4.6542f, 7.8439f, 4.3615f, 9.4045f, 3.7763f, 12.5257f)
                curveTo(2.9534f, 16.9146f, 2.5419f, 19.1091f, 3.7416f, 20.5545f)
                curveTo(4.9412f, 22.0f, 7.1739f, 22.0f, 11.6393f, 22.0f)
                horizontalLineTo(12.3605f)
                curveTo(16.8259f, 22.0f, 19.0586f, 22.0f, 20.2582f, 20.5545f)
                curveTo(20.9542f, 19.7159f, 21.1079f, 18.6252f, 20.9536f, 17.0f)
            }
        }
        .build()
        return _bagMusic!!
    }

private var _bagMusic: ImageVector? = null
