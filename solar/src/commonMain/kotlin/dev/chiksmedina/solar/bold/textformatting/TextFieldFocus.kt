package dev.chiksmedina.solar.bold.textformatting

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
import dev.chiksmedina.solar.bold.TextFormattingGroup

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
                moveTo(15.75f, 2.0f)
                curveTo(15.75f, 1.5858f, 15.4142f, 1.25f, 15.0f, 1.25f)
                curveTo(14.5858f, 1.25f, 14.25f, 1.5858f, 14.25f, 2.0f)
                verticalLineTo(22.0f)
                curveTo(14.25f, 22.4142f, 14.5858f, 22.75f, 15.0f, 22.75f)
                curveTo(15.4142f, 22.75f, 15.75f, 22.4142f, 15.75f, 22.0f)
                verticalLineTo(19.9944f)
                curveTo(18.3859f, 19.9668f, 19.8541f, 19.8028f, 20.8284f, 18.8284f)
                curveTo(22.0f, 17.6569f, 22.0f, 15.7712f, 22.0f, 12.0f)
                curveTo(22.0f, 8.2288f, 22.0f, 6.3432f, 20.8284f, 5.1716f)
                curveTo(19.8541f, 4.1972f, 18.3859f, 4.0332f, 15.75f, 4.0056f)
                verticalLineTo(2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.0f, 20.0f)
                curveTo(6.2288f, 20.0f, 4.3432f, 20.0f, 3.1716f, 18.8284f)
                curveTo(2.0f, 17.6569f, 2.0f, 15.7712f, 2.0f, 12.0f)
                curveTo(2.0f, 8.2288f, 2.0f, 6.3432f, 3.1716f, 5.1716f)
                curveTo(4.3432f, 4.0f, 6.2288f, 4.0f, 10.0f, 4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(10.0f)
                close()
                moveTo(6.8178f, 7.7873f)
                curveTo(7.1178f, 7.7499f, 7.4843f, 7.75f, 7.8838f, 7.75f)
                horizontalLineTo(10.1162f)
                curveTo(10.5157f, 7.75f, 10.8822f, 7.7499f, 11.1822f, 7.7873f)
                curveTo(11.5109f, 7.8283f, 11.8612f, 7.9242f, 12.1624f, 8.1919f)
                curveTo(12.2138f, 8.2375f, 12.2625f, 8.2862f, 12.3081f, 8.3376f)
                curveTo(12.5758f, 8.6388f, 12.6717f, 8.9892f, 12.7127f, 9.3178f)
                curveTo(12.7501f, 9.6178f, 12.7501f, 9.9843f, 12.75f, 10.3838f)
                lineTo(12.75f, 10.425f)
                curveTo(12.75f, 10.8392f, 12.4142f, 11.175f, 12.0f, 11.175f)
                curveTo(11.5858f, 11.175f, 11.25f, 10.8392f, 11.25f, 10.425f)
                curveTo(11.25f, 9.9705f, 11.2486f, 9.6993f, 11.2242f, 9.5035f)
                curveTo(11.1998f, 9.3076f, 10.9965f, 9.2758f, 10.9965f, 9.2758f)
                curveTo(10.8007f, 9.2514f, 10.5295f, 9.25f, 10.075f, 9.25f)
                horizontalLineTo(9.75f)
                verticalLineTo(14.75f)
                horizontalLineTo(11.0f)
                curveTo(11.4142f, 14.75f, 11.75f, 15.0858f, 11.75f, 15.5f)
                curveTo(11.75f, 15.9142f, 11.4142f, 16.25f, 11.0f, 16.25f)
                horizontalLineTo(7.0f)
                curveTo(6.5858f, 16.25f, 6.25f, 15.9142f, 6.25f, 15.5f)
                curveTo(6.25f, 15.0858f, 6.5858f, 14.75f, 7.0f, 14.75f)
                horizontalLineTo(8.25f)
                verticalLineTo(9.25f)
                horizontalLineTo(7.925f)
                curveTo(7.4705f, 9.25f, 7.1993f, 9.2514f, 7.0035f, 9.2758f)
                curveTo(7.0035f, 9.2758f, 6.8002f, 9.3076f, 6.7758f, 9.5035f)
                curveTo(6.7514f, 9.6993f, 6.75f, 9.9705f, 6.75f, 10.425f)
                curveTo(6.75f, 10.8392f, 6.4142f, 11.175f, 6.0f, 11.175f)
                curveTo(5.5858f, 11.175f, 5.25f, 10.8392f, 5.25f, 10.425f)
                lineTo(5.25f, 10.3838f)
                curveTo(5.25f, 9.9843f, 5.2499f, 9.6178f, 5.2873f, 9.3178f)
                curveTo(5.3283f, 8.9892f, 5.4242f, 8.6388f, 5.6919f, 8.3376f)
                curveTo(5.7375f, 8.2862f, 5.7862f, 8.2375f, 5.8376f, 8.1919f)
                curveTo(6.1388f, 7.9242f, 6.4892f, 7.8283f, 6.8178f, 7.7873f)
                close()
            }
        }
            .build()
        return _textFieldFocus!!
    }

private var _textFieldFocus: ImageVector? = null
