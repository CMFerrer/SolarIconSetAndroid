package dev.chiksmedina.solar.boldduotone.school

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
import dev.chiksmedina.solar.boldduotone.SchoolGroup

val SchoolGroup.Document: ImageVector
    get() {
        if (_document != null) {
            return _document!!
        }
        _document = Builder(
            name = "Document", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(4.0f, 4.6943f)
                verticalLineTo(18.6943f)
                curveTo(4.0f, 20.3512f, 5.3432f, 21.6943f, 7.0f, 21.6943f)
                horizontalLineTo(17.0f)
                curveTo(18.6569f, 21.6943f, 20.0f, 20.3512f, 20.0f, 18.6943f)
                verticalLineTo(8.6943f)
                curveTo(20.0f, 7.0375f, 18.6569f, 5.6943f, 17.0f, 5.6943f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 5.6943f, 4.0f, 5.2466f, 4.0f, 4.6943f)
                close()
                moveTo(7.25f, 11.6943f)
                curveTo(7.25f, 11.2801f, 7.5858f, 10.9443f, 8.0f, 10.9443f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 10.9443f, 16.75f, 11.2801f, 16.75f, 11.6943f)
                curveTo(16.75f, 12.1085f, 16.4142f, 12.4443f, 16.0f, 12.4443f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 12.4443f, 7.25f, 12.1085f, 7.25f, 11.6943f)
                close()
                moveTo(7.25f, 15.1943f)
                curveTo(7.25f, 14.7801f, 7.5858f, 14.4443f, 8.0f, 14.4443f)
                horizontalLineTo(13.5f)
                curveTo(13.9142f, 14.4443f, 14.25f, 14.7801f, 14.25f, 15.1943f)
                curveTo(14.25f, 15.6085f, 13.9142f, 15.9443f, 13.5f, 15.9443f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 15.9443f, 7.25f, 15.6085f, 7.25f, 15.1943f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.0f, 4.0004f)
                verticalLineTo(5.865f)
                curveTo(17.6872f, 5.7545f, 17.3506f, 5.6943f, 17.0f, 5.6943f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 5.6943f, 4.0f, 5.2466f, 4.0f, 4.6943f)
                verticalLineTo(4.6233f)
                curveTo(4.0f, 4.0903f, 4.3919f, 3.6384f, 4.9196f, 3.563f)
                lineTo(15.7172f, 2.0205f)
                curveTo(16.922f, 1.8484f, 18.0f, 2.7833f, 18.0f, 4.0004f)
                close()
            }
        }
            .build()
        return _document!!
    }

private var _document: ImageVector? = null
