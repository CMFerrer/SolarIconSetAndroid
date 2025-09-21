package dev.chiksmedina.solar.outline.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.SportsGroup

val SportsGroup.Rugby: ImageVector
    get() {
        if (_rugby != null) {
            return _rugby!!
        }
        _rugby = Builder(
            name = "Rugby", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(15.1665f, 2.7584f)
                lineTo(21.2416f, 8.8335f)
                curveTo(21.2677f, 7.8118f, 21.2303f, 6.8435f, 21.1649f, 5.9886f)
                curveTo(21.0341f, 4.278f, 19.722f, 2.9659f, 18.0114f, 2.8351f)
                curveTo(17.1565f, 2.7697f, 16.1882f, 2.7323f, 15.1665f, 2.7584f)
                close()
                moveTo(21.1071f, 10.8203f)
                lineTo(13.1797f, 2.8928f)
                curveTo(10.483f, 3.1978f, 7.7796f, 4.0424f, 5.911f, 5.911f)
                curveTo(4.0424f, 7.7796f, 3.1978f, 10.483f, 2.8928f, 13.1797f)
                lineTo(10.8203f, 21.1071f)
                curveTo(13.517f, 20.8022f, 16.2204f, 19.9576f, 18.089f, 18.089f)
                curveTo(19.9576f, 16.2204f, 20.8022f, 13.517f, 21.1071f, 10.8203f)
                close()
                moveTo(8.8335f, 21.2416f)
                lineTo(2.7584f, 15.1665f)
                curveTo(2.7323f, 16.1882f, 2.7697f, 17.1565f, 2.8351f, 18.0114f)
                curveTo(2.9659f, 19.722f, 4.278f, 21.0341f, 5.9886f, 21.1649f)
                curveTo(6.8435f, 21.2303f, 7.8118f, 21.2677f, 8.8335f, 21.2416f)
                close()
                moveTo(13.3854f, 1.3632f)
                curveTo(15.1096f, 1.1973f, 16.7638f, 1.2353f, 18.1257f, 1.3394f)
                curveTo(20.5746f, 1.5267f, 22.4733f, 3.4254f, 22.6606f, 5.8743f)
                curveTo(22.7647f, 7.2362f, 22.8027f, 8.8904f, 22.6368f, 10.6146f)
                curveTo(22.3524f, 13.5707f, 21.4579f, 16.8414f, 19.1497f, 19.1497f)
                curveTo(16.8414f, 21.4579f, 13.5707f, 22.3524f, 10.6146f, 22.6368f)
                curveTo(8.8904f, 22.8027f, 7.2362f, 22.7647f, 5.8743f, 22.6606f)
                curveTo(3.4254f, 22.4733f, 1.5267f, 20.5746f, 1.3394f, 18.1257f)
                curveTo(1.2353f, 16.7638f, 1.1973f, 15.1096f, 1.3632f, 13.3854f)
                curveTo(1.6476f, 10.4293f, 2.5421f, 7.1586f, 4.8503f, 4.8503f)
                curveTo(7.1586f, 2.5421f, 10.4293f, 1.6476f, 13.3854f, 1.3632f)
                close()
                moveTo(11.9426f, 8.1601f)
                curveTo(12.2355f, 7.8672f, 12.7104f, 7.8672f, 13.0032f, 8.1601f)
                lineTo(13.8914f, 9.0482f)
                lineTo(14.7795f, 8.1601f)
                curveTo(15.0723f, 7.8672f, 15.5472f, 7.8672f, 15.8401f, 8.1601f)
                curveTo(16.133f, 8.453f, 16.133f, 8.9279f, 15.8401f, 9.2208f)
                lineTo(14.952f, 10.1089f)
                lineTo(15.8401f, 10.997f)
                curveTo(16.133f, 11.2899f, 16.133f, 11.7647f, 15.8401f, 12.0576f)
                curveTo(15.5472f, 12.3505f, 15.0723f, 12.3505f, 14.7795f, 12.0576f)
                lineTo(13.8914f, 11.1695f)
                lineTo(13.0608f, 12.0001f)
                lineTo(13.9489f, 12.8882f)
                curveTo(14.2418f, 13.1811f, 14.2418f, 13.656f, 13.9489f, 13.9489f)
                curveTo(13.656f, 14.2418f, 13.1811f, 14.2418f, 12.8882f, 13.9489f)
                lineTo(12.0001f, 13.0608f)
                lineTo(11.1695f, 13.8914f)
                lineTo(12.0576f, 14.7795f)
                curveTo(12.3505f, 15.0723f, 12.3505f, 15.5472f, 12.0576f, 15.8401f)
                curveTo(11.7647f, 16.133f, 11.2899f, 16.133f, 10.997f, 15.8401f)
                lineTo(10.1089f, 14.952f)
                lineTo(9.2208f, 15.8401f)
                curveTo(8.9279f, 16.133f, 8.453f, 16.133f, 8.1601f, 15.8401f)
                curveTo(7.8672f, 15.5472f, 7.8672f, 15.0723f, 8.1601f, 14.7795f)
                lineTo(9.0482f, 13.8914f)
                lineTo(8.1601f, 13.0032f)
                curveTo(7.8672f, 12.7104f, 7.8672f, 12.2355f, 8.1601f, 11.9426f)
                curveTo(8.453f, 11.6497f, 8.9279f, 11.6497f, 9.2208f, 11.9426f)
                lineTo(10.1089f, 12.8307f)
                lineTo(10.9394f, 12.0001f)
                lineTo(10.0513f, 11.112f)
                curveTo(9.7584f, 10.8191f, 9.7584f, 10.3442f, 10.0513f, 10.0513f)
                curveTo(10.3442f, 9.7584f, 10.8191f, 9.7584f, 11.112f, 10.0513f)
                lineTo(12.0001f, 10.9394f)
                lineTo(12.8307f, 10.1089f)
                lineTo(11.9426f, 9.2208f)
                curveTo(11.6497f, 8.9279f, 11.6497f, 8.453f, 11.9426f, 8.1601f)
                close()
            }
        }
            .build()
        return _rugby!!
    }

private var _rugby: ImageVector? = null
