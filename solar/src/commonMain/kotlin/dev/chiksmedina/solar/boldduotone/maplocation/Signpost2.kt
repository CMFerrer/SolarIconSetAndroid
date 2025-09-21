package dev.chiksmedina.solar.boldduotone.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.MapLocationGroup

val MapLocationGroup.Signpost2: ImageVector
    get() {
        if (_signpost2 != null) {
            return _signpost2!!
        }
        _signpost2 = Builder(
            name = "Signpost2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(12.75f, 2.0f)
                curveTo(12.75f, 1.5858f, 12.4142f, 1.25f, 12.0f, 1.25f)
                curveTo(11.5858f, 1.25f, 11.25f, 1.5858f, 11.25f, 2.0f)
                verticalLineTo(3.5f)
                horizontalLineTo(12.75f)
                verticalLineTo(2.0f)
                close()
                moveTo(11.25f, 10.5f)
                verticalLineTo(12.5f)
                horizontalLineTo(12.75f)
                verticalLineTo(10.5f)
                horizontalLineTo(11.25f)
                close()
                moveTo(11.25f, 21.25f)
                verticalLineTo(19.5f)
                horizontalLineTo(12.75f)
                verticalLineTo(21.25f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 21.25f, 14.75f, 21.5858f, 14.75f, 22.0f)
                curveTo(14.75f, 22.4142f, 14.4142f, 22.75f, 14.0f, 22.75f)
                horizontalLineTo(10.0f)
                curveTo(9.5858f, 22.75f, 9.25f, 22.4142f, 9.25f, 22.0f)
                curveTo(9.25f, 21.5858f, 9.5858f, 21.25f, 10.0f, 21.25f)
                horizontalLineTo(11.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(17.4995f, 3.5f)
                horizontalLineTo(6.7035f)
                curveTo(6.0459f, 3.5f, 5.7172f, 3.5f, 5.4154f, 3.5982f)
                curveTo(5.2823f, 3.6415f, 5.1541f, 3.6987f, 5.033f, 3.7688f)
                curveTo(4.7583f, 3.9277f, 4.5387f, 4.1723f, 4.0993f, 4.6616f)
                curveTo(3.2486f, 5.6089f, 2.8233f, 6.0826f, 2.7209f, 6.6362f)
                curveTo(2.6764f, 6.8767f, 2.6764f, 7.1233f, 2.7209f, 7.3638f)
                curveTo(2.8233f, 7.9174f, 3.2486f, 8.3911f, 4.0993f, 9.3384f)
                curveTo(4.5387f, 9.8277f, 4.7583f, 10.0723f, 5.033f, 10.2312f)
                curveTo(5.1541f, 10.3013f, 5.2823f, 10.3585f, 5.4154f, 10.4018f)
                curveTo(5.7172f, 10.5f, 6.0459f, 10.5f, 6.7035f, 10.5f)
                horizontalLineTo(17.4995f)
                curveTo(18.904f, 10.5f, 19.6062f, 10.5f, 20.1106f, 10.1629f)
                curveTo(20.329f, 10.017f, 20.5165f, 9.8295f, 20.6624f, 9.6111f)
                curveTo(20.9995f, 9.1067f, 20.9995f, 8.4045f, 20.9995f, 7.0f)
                curveTo(20.9995f, 5.5955f, 20.9995f, 4.8933f, 20.6624f, 4.3889f)
                curveTo(20.5165f, 4.1705f, 20.329f, 3.983f, 20.1106f, 3.8371f)
                curveTo(19.6062f, 3.5f, 18.904f, 3.5f, 17.4995f, 3.5f)
                close()
                moveTo(9.0f, 6.25f)
                curveTo(8.5858f, 6.25f, 8.25f, 6.5858f, 8.25f, 7.0f)
                curveTo(8.25f, 7.4142f, 8.5858f, 7.75f, 9.0f, 7.75f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 7.75f, 15.75f, 7.4142f, 15.75f, 7.0f)
                curveTo(15.75f, 6.5858f, 15.4142f, 6.25f, 15.0f, 6.25f)
                horizontalLineTo(9.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(17.2955f, 12.5f)
                horizontalLineTo(6.4995f)
                curveTo(5.095f, 12.5f, 4.3928f, 12.5f, 3.8884f, 12.8371f)
                curveTo(3.67f, 12.983f, 3.4825f, 13.1705f, 3.3366f, 13.3889f)
                curveTo(2.9995f, 13.8933f, 2.9995f, 14.5955f, 2.9995f, 16.0f)
                curveTo(2.9995f, 17.4045f, 2.9995f, 18.1067f, 3.3366f, 18.6111f)
                curveTo(3.4825f, 18.8295f, 3.67f, 19.017f, 3.8884f, 19.1629f)
                curveTo(4.3928f, 19.5f, 5.095f, 19.5f, 6.4995f, 19.5f)
                horizontalLineTo(17.2955f)
                curveTo(17.9531f, 19.5f, 18.2819f, 19.5f, 18.5836f, 19.4018f)
                curveTo(18.7167f, 19.3585f, 18.8449f, 19.3013f, 18.966f, 19.2312f)
                curveTo(19.2407f, 19.0723f, 19.4604f, 18.8277f, 19.8997f, 18.3384f)
                curveTo(20.7504f, 17.3911f, 21.1757f, 16.9174f, 21.2781f, 16.3638f)
                curveTo(21.3226f, 16.1233f, 21.3226f, 15.8767f, 21.2781f, 15.6362f)
                curveTo(21.1757f, 15.0826f, 20.7504f, 14.6089f, 19.8997f, 13.6616f)
                curveTo(19.4604f, 13.1723f, 19.2407f, 12.9277f, 18.966f, 12.7688f)
                curveTo(18.8449f, 12.6987f, 18.7167f, 12.6415f, 18.5836f, 12.5982f)
                curveTo(18.2819f, 12.5f, 17.9531f, 12.5f, 17.2955f, 12.5f)
                close()
                moveTo(8.25f, 16.0f)
                curveTo(8.25f, 15.5858f, 8.5858f, 15.25f, 9.0f, 15.25f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 15.25f, 15.75f, 15.5858f, 15.75f, 16.0f)
                curveTo(15.75f, 16.4142f, 15.4142f, 16.75f, 15.0f, 16.75f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 16.75f, 8.25f, 16.4142f, 8.25f, 16.0f)
                close()
            }
        }
            .build()
        return _signpost2!!
    }

private var _signpost2: ImageVector? = null
