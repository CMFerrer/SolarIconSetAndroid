package dev.chiksmedina.solar.boldduotone.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.ArrowsActionGroup

val ArrowsActionGroup.Reorder: ImageVector
    get() {
        if (_reorder != null) {
            return _reorder!!
        }
        _reorder = Builder(
            name = "Reorder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.5f, 17.5f)
                curveTo(9.5f, 16.5654f, 9.5f, 16.0981f, 9.701f, 15.75f)
                curveTo(9.8326f, 15.522f, 10.022f, 15.3326f, 10.25f, 15.201f)
                curveTo(10.5981f, 15.0f, 11.0654f, 15.0f, 12.0f, 15.0f)
                curveTo(12.9346f, 15.0f, 13.4019f, 15.0f, 13.75f, 15.201f)
                curveTo(13.978f, 15.3326f, 14.1674f, 15.522f, 14.299f, 15.75f)
                curveTo(14.5f, 16.0981f, 14.5f, 16.5654f, 14.5f, 17.5f)
                curveTo(14.5f, 18.4346f, 14.5f, 18.9019f, 14.299f, 19.25f)
                curveTo(14.1674f, 19.478f, 13.978f, 19.6674f, 13.75f, 19.799f)
                curveTo(13.4019f, 20.0f, 12.9346f, 20.0f, 12.0f, 20.0f)
                curveTo(11.0654f, 20.0f, 10.5981f, 20.0f, 10.25f, 19.799f)
                curveTo(10.022f, 19.6674f, 9.8326f, 19.478f, 9.701f, 19.25f)
                curveTo(9.5f, 18.9019f, 9.5f, 18.4346f, 9.5f, 17.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.7f, strokeAlpha
                = 0.7f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.0f, 17.5f)
                curveTo(17.0f, 16.5654f, 17.0f, 16.0981f, 17.201f, 15.75f)
                curveTo(17.3326f, 15.522f, 17.522f, 15.3326f, 17.75f, 15.201f)
                curveTo(18.0981f, 15.0f, 18.5654f, 15.0f, 19.5f, 15.0f)
                curveTo(20.4346f, 15.0f, 20.9019f, 15.0f, 21.25f, 15.201f)
                curveTo(21.478f, 15.3326f, 21.6674f, 15.522f, 21.799f, 15.75f)
                curveTo(22.0f, 16.0981f, 22.0f, 16.5654f, 22.0f, 17.5f)
                curveTo(22.0f, 18.4346f, 22.0f, 18.9019f, 21.799f, 19.25f)
                curveTo(21.6674f, 19.478f, 21.478f, 19.6674f, 21.25f, 19.799f)
                curveTo(20.9019f, 20.0f, 20.4346f, 20.0f, 19.5f, 20.0f)
                curveTo(18.5654f, 20.0f, 18.0981f, 20.0f, 17.75f, 19.799f)
                curveTo(17.522f, 19.6674f, 17.3326f, 19.478f, 17.201f, 19.25f)
                curveTo(17.0f, 18.9019f, 17.0f, 18.4346f, 17.0f, 17.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.4463f, 3.25f)
                curveTo(8.3135f, 3.25f, 7.3877f, 3.25f, 6.6569f, 3.3482f)
                curveTo(5.8929f, 3.4509f, 5.2306f, 3.6732f, 4.7019f, 4.2019f)
                curveTo(4.1732f, 4.7306f, 3.9509f, 5.3929f, 3.8482f, 6.1569f)
                curveTo(3.75f, 6.8878f, 3.75f, 7.8135f, 3.75f, 8.9463f)
                lineTo(3.75f, 15.0f)
                curveTo(3.75f, 15.002f, 3.75f, 15.0041f, 3.75f, 15.0061f)
                curveTo(3.2849f, 15.0196f, 2.9893f, 15.0628f, 2.75f, 15.201f)
                curveTo(2.522f, 15.3326f, 2.3326f, 15.522f, 2.201f, 15.75f)
                curveTo(2.0f, 16.0981f, 2.0f, 16.5654f, 2.0f, 17.5f)
                curveTo(2.0f, 18.4346f, 2.0f, 18.9019f, 2.201f, 19.25f)
                curveTo(2.3326f, 19.478f, 2.522f, 19.6674f, 2.75f, 19.799f)
                curveTo(3.0981f, 20.0f, 3.5654f, 20.0f, 4.5f, 20.0f)
                curveTo(5.4346f, 20.0f, 5.9019f, 20.0f, 6.25f, 19.799f)
                curveTo(6.478f, 19.6674f, 6.6674f, 19.478f, 6.799f, 19.25f)
                curveTo(7.0f, 18.9019f, 7.0f, 18.4346f, 7.0f, 17.5f)
                curveTo(7.0f, 16.5654f, 7.0f, 16.0981f, 6.799f, 15.75f)
                curveTo(6.6674f, 15.522f, 6.478f, 15.3326f, 6.25f, 15.201f)
                curveTo(6.0107f, 15.0628f, 5.7151f, 15.0196f, 5.25f, 15.0061f)
                curveTo(5.25f, 15.0041f, 5.25f, 15.002f, 5.25f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(5.25f, 7.8003f, 5.2516f, 6.9759f, 5.3348f, 6.3568f)
                curveTo(5.4152f, 5.7591f, 5.559f, 5.4661f, 5.7626f, 5.2626f)
                curveTo(5.9661f, 5.059f, 6.2591f, 4.9152f, 6.8568f, 4.8348f)
                curveTo(7.4759f, 4.7516f, 8.3003f, 4.75f, 9.5f, 4.75f)
                horizontalLineTo(14.5f)
                curveTo(15.6997f, 4.75f, 16.524f, 4.7516f, 17.1432f, 4.8348f)
                curveTo(17.7409f, 4.9152f, 18.0339f, 5.059f, 18.2374f, 5.2626f)
                curveTo(18.441f, 5.4661f, 18.5848f, 5.7591f, 18.6652f, 6.3568f)
                curveTo(18.7484f, 6.9759f, 18.75f, 7.8003f, 18.75f, 9.0f)
                verticalLineTo(10.1893f)
                lineTo(18.0303f, 9.4697f)
                curveTo(17.7374f, 9.1768f, 17.2626f, 9.1768f, 16.9697f, 9.4697f)
                curveTo(16.6768f, 9.7626f, 16.6768f, 10.2374f, 16.9697f, 10.5303f)
                lineTo(18.9697f, 12.5303f)
                curveTo(19.2626f, 12.8232f, 19.7374f, 12.8232f, 20.0303f, 12.5303f)
                lineTo(22.0303f, 10.5303f)
                curveTo(22.3232f, 10.2374f, 22.3232f, 9.7626f, 22.0303f, 9.4697f)
                curveTo(21.7374f, 9.1768f, 21.2626f, 9.1768f, 20.9697f, 9.4697f)
                lineTo(20.25f, 10.1893f)
                verticalLineTo(8.9463f)
                curveTo(20.25f, 7.8135f, 20.25f, 6.8878f, 20.1518f, 6.1569f)
                curveTo(20.0491f, 5.3929f, 19.8268f, 4.7306f, 19.2981f, 4.2019f)
                curveTo(18.7694f, 3.6732f, 18.1071f, 3.4509f, 17.3431f, 3.3482f)
                curveTo(16.6123f, 3.25f, 15.6865f, 3.25f, 14.5537f, 3.25f)
                horizontalLineTo(9.4463f)
                close()
            }
        }
            .build()
        return _reorder!!
    }

private var _reorder: ImageVector? = null
