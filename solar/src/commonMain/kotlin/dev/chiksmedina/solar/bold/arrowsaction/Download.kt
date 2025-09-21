package dev.chiksmedina.solar.bold.arrowsaction

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
import dev.chiksmedina.solar.bold.ArrowsActionGroup

val ArrowsActionGroup.Download: ImageVector
    get() {
        if (_download != null) {
            return _download!!
        }
        _download = Builder(
            name = "Download", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 1.25f)
                curveTo(11.5858f, 1.25f, 11.25f, 1.5858f, 11.25f, 2.0f)
                verticalLineTo(12.9726f)
                lineTo(9.5694f, 11.0119f)
                curveTo(9.2999f, 10.6974f, 8.8264f, 10.661f, 8.5119f, 10.9306f)
                curveTo(8.1974f, 11.2001f, 8.161f, 11.6736f, 8.4306f, 11.9881f)
                lineTo(11.4306f, 15.4881f)
                curveTo(11.573f, 15.6543f, 11.7811f, 15.75f, 12.0f, 15.75f)
                curveTo(12.2189f, 15.75f, 12.427f, 15.6543f, 12.5694f, 15.4881f)
                lineTo(15.5694f, 11.9881f)
                curveTo(15.839f, 11.6736f, 15.8026f, 11.2001f, 15.4881f, 10.9306f)
                curveTo(15.1736f, 10.661f, 14.7001f, 10.6974f, 14.4306f, 11.0119f)
                lineTo(12.75f, 12.9726f)
                lineTo(12.75f, 2.0f)
                curveTo(12.75f, 1.5858f, 12.4142f, 1.25f, 12.0f, 1.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.25f, 9.0f)
                verticalLineTo(9.3783f)
                curveTo(14.9836f, 9.1197f, 15.8312f, 9.2491f, 16.4642f, 9.7917f)
                curveTo(17.4077f, 10.6004f, 17.517f, 12.0208f, 16.7083f, 12.9643f)
                lineTo(13.7083f, 16.4643f)
                curveTo(13.2808f, 16.963f, 12.6568f, 17.25f, 12.0f, 17.25f)
                curveTo(11.3431f, 17.25f, 10.7191f, 16.963f, 10.2916f, 16.4643f)
                lineTo(7.2916f, 12.9643f)
                curveTo(6.4829f, 12.0208f, 6.5922f, 10.6004f, 7.5357f, 9.7917f)
                curveTo(8.1687f, 9.2491f, 9.0164f, 9.1197f, 9.75f, 9.3783f)
                verticalLineTo(9.0f)
                horizontalLineTo(8.0f)
                curveTo(5.1716f, 9.0f, 3.7574f, 9.0f, 2.8787f, 9.8787f)
                curveTo(2.0f, 10.7574f, 2.0f, 12.1716f, 2.0f, 15.0f)
                verticalLineTo(16.0f)
                curveTo(2.0f, 18.8284f, 2.0f, 20.2426f, 2.8787f, 21.1213f)
                curveTo(3.7574f, 22.0f, 5.1716f, 22.0f, 8.0f, 22.0f)
                horizontalLineTo(16.0f)
                curveTo(18.8284f, 22.0f, 20.2426f, 22.0f, 21.1213f, 21.1213f)
                curveTo(22.0f, 20.2426f, 22.0f, 18.8284f, 22.0f, 16.0f)
                verticalLineTo(15.0f)
                curveTo(22.0f, 12.1716f, 22.0f, 10.7574f, 21.1213f, 9.8787f)
                curveTo(20.2426f, 9.0f, 18.8284f, 9.0f, 16.0f, 9.0f)
                horizontalLineTo(14.25f)
                close()
            }
        }
            .build()
        return _download!!
    }

private var _download: ImageVector? = null
