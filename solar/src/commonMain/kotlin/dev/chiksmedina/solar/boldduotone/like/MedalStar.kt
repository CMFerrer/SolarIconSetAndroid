package dev.chiksmedina.solar.boldduotone.like

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.LikeGroup

val LikeGroup.MedalStar: ImageVector
    get() {
        if (_medalStar != null) {
            return _medalStar!!
        }
        _medalStar = Builder(
            name = "MedalStar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.7949f, 2.0f)
                horizontalLineTo(10.7949f)
                curveTo(8.9093f, 2.0f, 7.9665f, 2.0f, 7.3807f, 2.5858f)
                curveTo(6.7949f, 3.1716f, 6.7949f, 4.1144f, 6.7949f, 6.0f)
                verticalLineTo(8.0f)
                verticalLineTo(9.5f)
                horizontalLineTo(16.7949f)
                verticalLineTo(8.0f)
                verticalLineTo(6.0f)
                curveTo(16.7949f, 4.1144f, 16.7949f, 3.1716f, 16.2091f, 2.5858f)
                curveTo(15.6233f, 2.0f, 14.6805f, 2.0f, 12.7949f, 2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(13.2304f, 5.7831f)
                curveTo(12.3352f, 5.295f, 11.2533f, 5.295f, 10.358f, 5.7831f)
                lineTo(5.5638f, 8.3973f)
                curveTo(4.5998f, 8.9229f, 4.0f, 9.9332f, 4.0f, 11.0312f)
                verticalLineTo(15.9688f)
                curveTo(4.0f, 17.0668f, 4.5998f, 18.0771f, 5.5638f, 18.6027f)
                lineTo(10.358f, 21.2169f)
                curveTo(11.2533f, 21.705f, 12.3352f, 21.705f, 13.2304f, 21.2169f)
                lineTo(18.0246f, 18.6027f)
                curveTo(18.9886f, 18.0771f, 19.5885f, 17.0668f, 19.5885f, 15.9688f)
                verticalLineTo(11.0312f)
                curveTo(19.5885f, 9.9332f, 18.9886f, 8.9229f, 18.0246f, 8.3973f)
                lineTo(13.2304f, 5.7831f)
                close()
                moveTo(11.7944f, 10.5f)
                curveTo(11.5104f, 10.5f, 11.3204f, 10.8408f, 10.9404f, 11.5225f)
                lineTo(10.8421f, 11.6989f)
                curveTo(10.7341f, 11.8926f, 10.6801f, 11.9894f, 10.5959f, 12.0533f)
                curveTo(10.5117f, 12.1172f, 10.4069f, 12.141f, 10.1972f, 12.1884f)
                lineTo(10.0063f, 12.2316f)
                curveTo(9.2684f, 12.3986f, 8.8994f, 12.482f, 8.8117f, 12.7643f)
                curveTo(8.7239f, 13.0466f, 8.9754f, 13.3407f, 9.4785f, 13.929f)
                lineTo(9.6086f, 14.0812f)
                curveTo(9.7516f, 14.2483f, 9.823f, 14.3319f, 9.8552f, 14.4353f)
                curveTo(9.8874f, 14.5387f, 9.8765f, 14.6502f, 9.8549f, 14.8733f)
                lineTo(9.8352f, 15.0763f)
                curveTo(9.7592f, 15.8612f, 9.7212f, 16.2536f, 9.951f, 16.4281f)
                curveTo(10.1808f, 16.6025f, 10.5262f, 16.4435f, 11.2171f, 16.1254f)
                lineTo(11.3959f, 16.0431f)
                curveTo(11.5922f, 15.9527f, 11.6904f, 15.9075f, 11.7944f, 15.9075f)
                curveTo(11.8985f, 15.9075f, 11.9967f, 15.9527f, 12.193f, 16.0431f)
                lineTo(12.3717f, 16.1254f)
                curveTo(13.0626f, 16.4435f, 13.4081f, 16.6025f, 13.6379f, 16.4281f)
                curveTo(13.8677f, 16.2536f, 13.8297f, 15.8612f, 13.7536f, 15.0763f)
                lineTo(13.7339f, 14.8733f)
                curveTo(13.7123f, 14.6502f, 13.7015f, 14.5387f, 13.7337f, 14.4353f)
                curveTo(13.7658f, 14.3319f, 13.8373f, 14.2483f, 13.9802f, 14.0812f)
                lineTo(14.1104f, 13.929f)
                curveTo(14.6135f, 13.3407f, 14.865f, 13.0466f, 14.7772f, 12.7643f)
                curveTo(14.6894f, 12.482f, 14.3205f, 12.3986f, 13.5826f, 12.2316f)
                lineTo(13.3917f, 12.1884f)
                curveTo(13.182f, 12.141f, 13.0771f, 12.1172f, 12.993f, 12.0533f)
                curveTo(12.9088f, 11.9894f, 12.8548f, 11.8926f, 12.7468f, 11.6989f)
                lineTo(12.6485f, 11.5225f)
                curveTo(12.2685f, 10.8408f, 12.0785f, 10.5f, 11.7944f, 10.5f)
                close()
            }
        }
            .build()
        return _medalStar!!
    }

private var _medalStar: ImageVector? = null
