package dev.chiksmedina.solar.linear.transportpartsservice

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
import dev.chiksmedina.solar.linear.TransportPartsServiceGroup

val TransportPartsServiceGroup.Accumulator: ImageVector
    get() {
        if (_accumulator != null) {
            return _accumulator!!
        }
        _accumulator = Builder(
            name = "Accumulator", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 14.0f)
                verticalLineTo(11.9751f)
                curveTo(22.0f, 10.1294f, 22.0f, 9.2066f, 21.6078f, 8.517f)
                curveTo(21.3409f, 8.0477f, 20.9523f, 7.6591f, 20.483f, 7.3922f)
                curveTo(19.7934f, 7.0f, 18.8706f, 7.0f, 17.0249f, 7.0f)
                horizontalLineTo(16.7454f)
                curveTo(16.6224f, 7.0f, 16.561f, 7.0f, 16.5042f, 6.9935f)
                curveTo(16.2083f, 6.9596f, 15.943f, 6.7956f, 15.7803f, 6.5461f)
                curveTo(15.7491f, 6.4983f, 15.7216f, 6.4433f, 15.6667f, 6.3333f)
                curveTo(15.5567f, 6.1135f, 15.5017f, 6.0034f, 15.4394f, 5.9078f)
                curveTo(15.1141f, 5.4088f, 14.5833f, 5.0808f, 13.9915f, 5.013f)
                curveTo(13.8781f, 5.0f, 13.7552f, 5.0f, 13.5093f, 5.0f)
                horizontalLineTo(10.4907f)
                curveTo(10.2448f, 5.0f, 10.1219f, 5.0f, 10.0085f, 5.013f)
                curveTo(9.4167f, 5.0808f, 8.8859f, 5.4088f, 8.5606f, 5.9078f)
                curveTo(8.4983f, 6.0035f, 8.4433f, 6.1134f, 8.3333f, 6.3333f)
                curveTo(8.2784f, 6.4433f, 8.2509f, 6.4983f, 8.2197f, 6.5461f)
                curveTo(8.057f, 6.7956f, 7.7917f, 6.9596f, 7.4958f, 6.9935f)
                curveTo(7.4391f, 7.0f, 7.3776f, 7.0f, 7.2546f, 7.0f)
                horizontalLineTo(6.9751f)
                curveTo(5.1294f, 7.0f, 4.2066f, 7.0f, 3.517f, 7.3922f)
                curveTo(3.0477f, 7.6591f, 2.6591f, 8.0477f, 2.3922f, 8.517f)
                curveTo(2.0f, 9.2066f, 2.0f, 10.1294f, 2.0f, 11.9751f)
                verticalLineTo(14.0f)
                curveTo(2.0f, 16.8284f, 2.0f, 18.2426f, 2.8787f, 19.1213f)
                curveTo(3.7574f, 20.0f, 5.1716f, 20.0f, 8.0f, 20.0f)
                horizontalLineTo(16.0f)
                curveTo(18.8284f, 20.0f, 20.2426f, 20.0f, 21.1213f, 19.1213f)
                curveTo(22.0f, 18.2426f, 22.0f, 16.8284f, 22.0f, 14.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.0f, 7.0f)
                verticalLineTo(6.0f)
                curveTo(7.0f, 5.0572f, 7.0f, 4.5858f, 6.7071f, 4.2929f)
                curveTo(6.4142f, 4.0f, 5.9428f, 4.0f, 5.0f, 4.0f)
                curveTo(4.0572f, 4.0f, 3.5858f, 4.0f, 3.2929f, 4.2929f)
                curveTo(3.0f, 4.5858f, 3.0f, 5.0572f, 3.0f, 6.0f)
                verticalLineTo(7.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.0f, 8.0f)
                verticalLineTo(6.0f)
                curveTo(21.0f, 5.0572f, 21.0f, 4.5858f, 20.7071f, 4.2929f)
                curveTo(20.4142f, 4.0f, 19.9428f, 4.0f, 19.0f, 4.0f)
                curveTo(18.0572f, 4.0f, 17.5858f, 4.0f, 17.2929f, 4.2929f)
                curveTo(17.0f, 4.5858f, 17.0f, 5.0572f, 17.0f, 6.0f)
                verticalLineTo(7.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 13.5f)
                horizontalLineTo(6.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.0f, 13.5f)
                lineTo(16.5f, 13.5f)
                moveTo(16.5f, 13.5f)
                lineTo(15.0f, 13.5f)
                moveTo(16.5f, 13.5f)
                lineTo(16.5f, 12.0f)
                moveTo(16.5f, 13.5f)
                lineTo(16.5f, 15.0f)
            }
        }
            .build()
        return _accumulator!!
    }

private var _accumulator: ImageVector? = null
