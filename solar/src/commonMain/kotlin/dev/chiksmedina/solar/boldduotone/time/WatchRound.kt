package dev.chiksmedina.solar.boldduotone.time

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.TimeGroup

val TimeGroup.WatchRound: ImageVector
    get() {
        if (_watchRound != null) {
            return _watchRound!!
        }
        _watchRound = Builder(
            name = "WatchRound", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 18.9767f)
                curveTo(15.866f, 18.9767f, 19.0f, 15.8531f, 19.0f, 11.9999f)
                curveTo(19.0f, 8.1468f, 15.866f, 5.0232f, 12.0f, 5.0232f)
                curveTo(8.134f, 5.0232f, 5.0f, 8.1468f, 5.0f, 11.9999f)
                curveTo(5.0f, 15.8531f, 8.134f, 18.9767f, 12.0f, 18.9767f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.2088f, 2.0f)
                horizontalLineTo(12.7914f)
                curveTo(14.3297f, 2.0f, 15.0988f, 2.0f, 15.6472f, 2.4399f)
                curveTo(16.1956f, 2.8798f, 16.3625f, 3.6307f, 16.6962f, 5.1323f)
                lineTo(17.0001f, 6.5f)
                lineTo(17.1564f, 7.2817f)
                curveTo(15.877f, 5.8935f, 14.0405f, 5.0234f, 12.0001f, 5.0234f)
                curveTo(9.9597f, 5.0234f, 8.1232f, 5.8935f, 6.8438f, 7.2817f)
                lineTo(7.0001f, 6.5f)
                lineTo(7.304f, 5.1323f)
                curveTo(7.6377f, 3.6307f, 7.8046f, 2.8798f, 8.353f, 2.4399f)
                curveTo(8.9014f, 2.0f, 9.6705f, 2.0f, 11.2088f, 2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.1562f, 16.7188f)
                curveTo(15.8768f, 18.1069f, 14.0403f, 18.9769f, 12.0f, 18.9769f)
                curveTo(9.9597f, 18.9769f, 8.1232f, 18.1069f, 6.8438f, 16.7188f)
                lineTo(7.0f, 17.5f)
                lineTo(7.3039f, 18.8677f)
                curveTo(7.6376f, 20.3693f, 7.8045f, 21.1202f, 8.3529f, 21.5601f)
                curveTo(8.9013f, 22.0f, 9.6704f, 22.0f, 11.2087f, 22.0f)
                horizontalLineTo(12.7913f)
                curveTo(14.3296f, 22.0f, 15.0987f, 22.0f, 15.6471f, 21.5601f)
                curveTo(16.1955f, 21.1202f, 16.3624f, 20.3693f, 16.6961f, 18.8677f)
                lineTo(17.0f, 17.5f)
                lineTo(17.1562f, 16.7188f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.6998f, 9.1381f)
                curveTo(12.6998f, 8.7528f, 12.3864f, 8.4404f, 11.9998f, 8.4404f)
                curveTo(11.6132f, 8.4404f, 11.2998f, 8.7528f, 11.2998f, 9.1381f)
                verticalLineTo(12.0004f)
                curveTo(11.2998f, 12.1901f, 11.3774f, 12.3717f, 11.5146f, 12.5033f)
                lineTo(13.3813f, 14.2922f)
                curveTo(13.66f, 14.5592f, 14.1031f, 14.5506f, 14.3711f, 14.2728f)
                curveTo(14.639f, 13.9951f, 14.6303f, 13.5534f, 14.3516f, 13.2864f)
                lineTo(12.6998f, 11.7033f)
                verticalLineTo(9.1381f)
                close()
            }
        }
            .build()
        return _watchRound!!
    }

private var _watchRound: ImageVector? = null
