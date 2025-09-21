package dev.chiksmedina.solar.broken.textformatting

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
import dev.chiksmedina.solar.broken.TextFormattingGroup

val TextFormattingGroup.TextFieldFocus: ImageVector
    get() {
        if (_textFieldFocus != null) {
            return _textFieldFocus!!
        }
        _textFieldFocus = Builder(
            name = "TextFieldFocus", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.25f, 15.5f)
                curveTo(8.25f, 15.9142f, 8.5858f, 16.25f, 9.0f, 16.25f)
                curveTo(9.4142f, 16.25f, 9.75f, 15.9142f, 9.75f, 15.5f)
                horizontalLineTo(8.25f)
                close()
                moveTo(11.6643f, 8.7525f)
                lineTo(12.1624f, 8.1919f)
                lineTo(12.1624f, 8.1919f)
                lineTo(11.6643f, 8.7525f)
                close()
                moveTo(11.25f, 10.425f)
                curveTo(11.25f, 10.8392f, 11.5858f, 11.175f, 12.0f, 11.175f)
                curveTo(12.4142f, 11.175f, 12.75f, 10.8392f, 12.75f, 10.425f)
                horizontalLineTo(11.25f)
                close()
                moveTo(11.7475f, 8.8357f)
                lineTo(12.3081f, 8.3376f)
                lineTo(12.3081f, 8.3376f)
                lineTo(11.7475f, 8.8357f)
                close()
                moveTo(6.3358f, 8.7525f)
                lineTo(5.8376f, 8.1919f)
                lineTo(5.8376f, 8.1919f)
                lineTo(6.3358f, 8.7525f)
                close()
                moveTo(5.25f, 10.425f)
                curveTo(5.25f, 10.8392f, 5.5858f, 11.175f, 6.0f, 11.175f)
                curveTo(6.4142f, 11.175f, 6.75f, 10.8392f, 6.75f, 10.425f)
                horizontalLineTo(5.25f)
                close()
                moveTo(6.2525f, 8.8357f)
                lineTo(5.6919f, 8.3376f)
                lineTo(5.6919f, 8.3376f)
                lineTo(6.2525f, 8.8357f)
                close()
                moveTo(7.0f, 14.75f)
                curveTo(6.5858f, 14.75f, 6.25f, 15.0858f, 6.25f, 15.5f)
                curveTo(6.25f, 15.9142f, 6.5858f, 16.25f, 7.0f, 16.25f)
                verticalLineTo(14.75f)
                close()
                moveTo(11.0f, 16.25f)
                curveTo(11.4142f, 16.25f, 11.75f, 15.9142f, 11.75f, 15.5f)
                curveTo(11.75f, 15.0858f, 11.4142f, 14.75f, 11.0f, 14.75f)
                verticalLineTo(16.25f)
                close()
                moveTo(7.925f, 9.25f)
                horizontalLineTo(9.0f)
                verticalLineTo(7.75f)
                horizontalLineTo(7.925f)
                verticalLineTo(9.25f)
                close()
                moveTo(9.0f, 9.25f)
                horizontalLineTo(10.075f)
                verticalLineTo(7.75f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.25f)
                close()
                moveTo(9.75f, 15.5f)
                verticalLineTo(8.5f)
                horizontalLineTo(8.25f)
                verticalLineTo(15.5f)
                horizontalLineTo(9.75f)
                close()
                moveTo(10.075f, 9.25f)
                curveTo(10.5295f, 9.25f, 10.8007f, 9.2514f, 10.9965f, 9.2758f)
                curveTo(11.1739f, 9.2979f, 11.1831f, 9.3283f, 11.1661f, 9.3131f)
                lineTo(12.1624f, 8.1919f)
                curveTo(11.8612f, 7.9242f, 11.5109f, 7.8283f, 11.1822f, 7.7873f)
                curveTo(10.8719f, 7.7486f, 10.4905f, 7.75f, 10.075f, 7.75f)
                verticalLineTo(9.25f)
                close()
                moveTo(12.75f, 10.425f)
                curveTo(12.75f, 10.0095f, 12.7514f, 9.6281f, 12.7127f, 9.3178f)
                curveTo(12.6717f, 8.9892f, 12.5758f, 8.6388f, 12.3081f, 8.3376f)
                lineTo(11.1869f, 9.3339f)
                curveTo(11.1717f, 9.3169f, 11.2021f, 9.3261f, 11.2242f, 9.5035f)
                curveTo(11.2486f, 9.6993f, 11.25f, 9.9705f, 11.25f, 10.425f)
                horizontalLineTo(12.75f)
                close()
                moveTo(11.1661f, 9.3131f)
                curveTo(11.1734f, 9.3196f, 11.1804f, 9.3266f, 11.1869f, 9.3339f)
                lineTo(12.3081f, 8.3376f)
                curveTo(12.2625f, 8.2862f, 12.2138f, 8.2375f, 12.1624f, 8.1919f)
                lineTo(11.1661f, 9.3131f)
                close()
                moveTo(7.925f, 7.75f)
                curveTo(7.5095f, 7.75f, 7.1281f, 7.7486f, 6.8178f, 7.7873f)
                curveTo(6.4891f, 7.8283f, 6.1388f, 7.9242f, 5.8376f, 8.1919f)
                lineTo(6.8339f, 9.3131f)
                curveTo(6.8169f, 9.3283f, 6.8261f, 9.2979f, 7.0035f, 9.2758f)
                curveTo(7.1993f, 9.2514f, 7.4705f, 9.25f, 7.925f, 9.25f)
                verticalLineTo(7.75f)
                close()
                moveTo(6.75f, 10.425f)
                curveTo(6.75f, 9.9705f, 6.7514f, 9.6993f, 6.7758f, 9.5035f)
                curveTo(6.7979f, 9.3261f, 6.8283f, 9.3169f, 6.8131f, 9.3339f)
                lineTo(5.6919f, 8.3376f)
                curveTo(5.4242f, 8.6388f, 5.3283f, 8.9892f, 5.2873f, 9.3178f)
                curveTo(5.2486f, 9.6281f, 5.25f, 10.0095f, 5.25f, 10.425f)
                horizontalLineTo(6.75f)
                close()
                moveTo(5.8376f, 8.1919f)
                curveTo(5.7862f, 8.2375f, 5.7375f, 8.2862f, 5.6919f, 8.3376f)
                lineTo(6.8131f, 9.3339f)
                curveTo(6.8197f, 9.3266f, 6.8266f, 9.3196f, 6.8339f, 9.3131f)
                lineTo(5.8376f, 8.1919f)
                close()
                moveTo(7.0f, 16.25f)
                horizontalLineTo(11.0f)
                verticalLineTo(14.75f)
                horizontalLineTo(7.0f)
                verticalLineTo(16.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 15.7712f, 22.0f, 17.6569f, 20.8284f, 18.8284f)
                curveTo(19.7653f, 19.8915f, 18.1143f, 19.99f, 15.0f, 19.9991f)
                moveTo(12.0f, 4.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 4.0f, 4.3432f, 4.0f, 3.1716f, 5.1716f)
                curveTo(2.0f, 6.3432f, 2.0f, 8.2288f, 2.0f, 12.0f)
                curveTo(2.0f, 15.7712f, 2.0f, 17.6569f, 3.1716f, 18.8284f)
                curveTo(4.3432f, 20.0f, 6.2288f, 20.0f, 10.0f, 20.0f)
                horizontalLineTo(12.0f)
                moveTo(15.0f, 4.0009f)
                curveTo(18.1143f, 4.01f, 19.7653f, 4.1085f, 20.8284f, 5.1716f)
                curveTo(21.4816f, 5.8247f, 21.7706f, 6.6999f, 21.8985f, 8.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.0f, 2.0f)
                verticalLineTo(22.0f)
            }
        }
            .build()
        return _textFieldFocus!!
    }

private var _textFieldFocus: ImageVector? = null
