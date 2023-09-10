package com.chiksmedina.solar.lineduotone.designtools

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
import com.chiksmedina.solar.lineduotone.DesignToolsGroup

val DesignToolsGroup.AlignVerticalCenter: ImageVector
    get() {
        if (_alignVerticalCenter != null) {
            return _alignVerticalCenter!!
        }
        _alignVerticalCenter = Builder(
            name = "AlignVerticalCenter", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.0f)
                lineTo(5.0f, 12.0f)
                moveTo(22.0f, 12.0f)
                lineTo(19.0f, 12.0f)
                moveTo(14.0f, 12.0f)
                lineTo(10.0f, 12.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.5f, 5.0f)
                curveTo(6.5654f, 5.0f, 6.0981f, 5.0f, 5.75f, 5.201f)
                curveTo(5.522f, 5.3326f, 5.3326f, 5.522f, 5.201f, 5.75f)
                curveTo(5.0f, 6.0981f, 5.0f, 6.5654f, 5.0f, 7.5f)
                lineTo(5.0f, 16.5f)
                curveTo(5.0f, 17.4346f, 5.0f, 17.9019f, 5.201f, 18.25f)
                curveTo(5.3326f, 18.478f, 5.522f, 18.6674f, 5.75f, 18.799f)
                curveTo(6.0981f, 19.0f, 6.5654f, 19.0f, 7.5f, 19.0f)
                curveTo(8.4346f, 19.0f, 8.9019f, 19.0f, 9.25f, 18.799f)
                curveTo(9.478f, 18.6674f, 9.6674f, 18.478f, 9.799f, 18.25f)
                curveTo(10.0f, 17.9019f, 10.0f, 17.4346f, 10.0f, 16.5f)
                lineTo(10.0f, 7.5f)
                curveTo(10.0f, 6.5654f, 10.0f, 6.0981f, 9.799f, 5.75f)
                curveTo(9.6674f, 5.522f, 9.478f, 5.3326f, 9.25f, 5.201f)
                curveTo(8.9019f, 5.0f, 8.4346f, 5.0f, 7.5f, 5.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.5f, 7.0f)
                curveTo(15.5654f, 7.0f, 15.0981f, 7.0f, 14.75f, 7.201f)
                curveTo(14.522f, 7.3326f, 14.3326f, 7.522f, 14.201f, 7.75f)
                curveTo(14.0f, 8.0981f, 14.0f, 8.5654f, 14.0f, 9.5f)
                lineTo(14.0f, 14.5f)
                curveTo(14.0f, 15.4346f, 14.0f, 15.9019f, 14.201f, 16.25f)
                curveTo(14.3326f, 16.478f, 14.522f, 16.6674f, 14.75f, 16.799f)
                curveTo(15.0981f, 17.0f, 15.5654f, 17.0f, 16.5f, 17.0f)
                curveTo(17.4346f, 17.0f, 17.9019f, 17.0f, 18.25f, 16.799f)
                curveTo(18.478f, 16.6674f, 18.6674f, 16.478f, 18.799f, 16.25f)
                curveTo(19.0f, 15.9019f, 19.0f, 15.4346f, 19.0f, 14.5f)
                verticalLineTo(9.5f)
                curveTo(19.0f, 8.5654f, 19.0f, 8.0981f, 18.799f, 7.75f)
                curveTo(18.6674f, 7.522f, 18.478f, 7.3326f, 18.25f, 7.201f)
                curveTo(17.9019f, 7.0f, 17.4346f, 7.0f, 16.5f, 7.0f)
                close()
            }
        }
            .build()
        return _alignVerticalCenter!!
    }

private var _alignVerticalCenter: ImageVector? = null
