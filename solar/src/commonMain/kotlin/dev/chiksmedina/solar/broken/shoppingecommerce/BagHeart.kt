package dev.chiksmedina.solar.broken.shoppingecommerce

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
import dev.chiksmedina.solar.broken.ShoppingEcommerceGroup

val ShoppingEcommerceGroup.BagHeart: ImageVector
    get() {
        if (_bagHeart != null) {
            return _bagHeart!!
        }
        _bagHeart = Builder(
            name = "BagHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 12.1913f)
                lineTo(11.4813f, 12.7331f)
                curveTo(11.7713f, 13.0108f, 12.2287f, 13.0108f, 12.5187f, 12.7331f)
                lineTo(12.0f, 12.1913f)
                close()
                moveTo(11.0429f, 15.8656f)
                lineTo(10.5992f, 16.4703f)
                lineTo(11.0429f, 15.8656f)
                close()
                moveTo(12.9571f, 15.8656f)
                lineTo(12.5135f, 15.2609f)
                lineTo(12.9571f, 15.8656f)
                close()
                moveTo(12.0f, 16.3276f)
                lineTo(12.0f, 17.0776f)
                lineTo(12.0f, 16.3276f)
                close()
                moveTo(11.4865f, 15.2609f)
                curveTo(11.0686f, 14.9542f, 10.6081f, 14.5712f, 10.2595f, 14.1681f)
                curveTo(9.8912f, 13.7423f, 9.75f, 13.4113f, 9.75f, 13.1967f)
                horizontalLineTo(8.25f)
                curveTo(8.25f, 13.9666f, 8.6912f, 14.6479f, 9.1249f, 15.1493f)
                curveTo(9.5782f, 15.6735f, 10.1391f, 16.1327f, 10.5992f, 16.4703f)
                lineTo(11.4865f, 15.2609f)
                close()
                moveTo(9.75f, 13.1967f)
                curveTo(9.75f, 12.6207f, 10.0126f, 12.37f, 10.2419f, 12.2896f)
                curveTo(10.4922f, 12.2019f, 10.9558f, 12.2299f, 11.4813f, 12.7331f)
                lineTo(12.5187f, 11.6496f)
                curveTo(11.6943f, 10.8603f, 10.6579f, 10.5543f, 9.7457f, 10.8741f)
                curveTo(8.8125f, 11.2012f, 8.25f, 12.0995f, 8.25f, 13.1967f)
                horizontalLineTo(9.75f)
                close()
                moveTo(13.4008f, 16.4703f)
                curveTo(13.8609f, 16.1327f, 14.4218f, 15.6735f, 14.8751f, 15.1493f)
                curveTo(15.3088f, 14.6479f, 15.75f, 13.9666f, 15.75f, 13.1967f)
                horizontalLineTo(14.25f)
                curveTo(14.25f, 13.4113f, 14.1088f, 13.7423f, 13.7405f, 14.1681f)
                curveTo(13.3919f, 14.5713f, 12.9314f, 14.9542f, 12.5135f, 15.2609f)
                lineTo(13.4008f, 16.4703f)
                close()
                moveTo(15.75f, 13.1967f)
                curveTo(15.75f, 12.0995f, 15.1875f, 11.2012f, 14.2543f, 10.8741f)
                curveTo(13.3421f, 10.5543f, 12.3057f, 10.8603f, 11.4813f, 11.6496f)
                lineTo(12.5187f, 12.7331f)
                curveTo(13.0442f, 12.2299f, 13.5078f, 12.2019f, 13.7581f, 12.2896f)
                curveTo(13.9874f, 12.37f, 14.25f, 12.6207f, 14.25f, 13.1967f)
                horizontalLineTo(15.75f)
                close()
                moveTo(10.5992f, 16.4703f)
                curveTo(10.9678f, 16.7407f, 11.3816f, 17.0775f, 12.0f, 17.0776f)
                lineTo(12.0f, 15.5776f)
                curveTo(11.9756f, 15.5776f, 11.9605f, 15.5775f, 11.9061f, 15.5488f)
                curveTo(11.8202f, 15.5034f, 11.7128f, 15.4269f, 11.4865f, 15.2609f)
                lineTo(10.5992f, 16.4703f)
                close()
                moveTo(12.5135f, 15.2609f)
                curveTo(12.2872f, 15.4269f, 12.1798f, 15.5034f, 12.0939f, 15.5488f)
                curveTo(12.0395f, 15.5775f, 12.0244f, 15.5776f, 12.0f, 15.5776f)
                lineTo(12.0f, 17.0776f)
                curveTo(12.6184f, 17.0776f, 13.0322f, 16.7407f, 13.4008f, 16.4703f)
                lineTo(12.5135f, 15.2609f)
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
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
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
        return _bagHeart!!
    }

private var _bagHeart: ImageVector? = null
