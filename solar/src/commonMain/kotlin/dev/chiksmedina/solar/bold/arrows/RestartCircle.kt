package dev.chiksmedina.solar.bold.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.ArrowsGroup

val ArrowsGroup.RestartCircle: ImageVector
    get() {
        if (_restartCircle != null) {
            return _restartCircle!!
        }
        _restartCircle = Builder(
            name = "RestartCircle", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(15.9346f, 5.5916f)
                curveTo(16.217f, 5.7066f, 16.4017f, 5.9812f, 16.4017f, 6.2862f)
                verticalLineTo(9.0007f)
                curveTo(16.4017f, 9.4149f, 16.0659f, 9.7507f, 15.6517f, 9.7507f)
                horizontalLineTo(13.0f)
                curveTo(12.6983f, 9.7507f, 12.4259f, 9.5698f, 12.3088f, 9.2917f)
                curveTo(12.1917f, 9.0136f, 12.2527f, 8.6924f, 12.4635f, 8.4766f)
                lineTo(13.225f, 7.6971f)
                curveTo(11.7795f, 7.2514f, 10.1467f, 7.613f, 9.001f, 8.786f)
                curveTo(7.333f, 10.4935f, 7.333f, 13.269f, 9.001f, 14.9765f)
                curveTo(10.6593f, 16.6742f, 13.3407f, 16.6742f, 14.999f, 14.9765f)
                curveTo(15.6769f, 14.2826f, 16.0805f, 13.4112f, 16.2069f, 12.5045f)
                curveTo(16.2651f, 12.0865f, 16.5972f, 11.7349f, 17.0192f, 11.7349f)
                curveTo(17.4246f, 11.7349f, 17.7609f, 12.0595f, 17.7217f, 12.463f)
                curveTo(17.5957f, 13.7606f, 17.0471f, 15.0265f, 16.072f, 16.0247f)
                curveTo(13.8252f, 18.3248f, 10.1748f, 18.3248f, 7.928f, 16.0247f)
                curveTo(5.6907f, 13.7344f, 5.6907f, 10.0281f, 7.928f, 7.7378f)
                curveTo(9.6655f, 5.9591f, 12.244f, 5.5546f, 14.3647f, 6.5304f)
                lineTo(15.1152f, 5.7621f)
                curveTo(15.3283f, 5.5439f, 15.6522f, 5.4765f, 15.9346f, 5.5916f)
                close()
            }
        }
            .build()
        return _restartCircle!!
    }

private var _restartCircle: ImageVector? = null
