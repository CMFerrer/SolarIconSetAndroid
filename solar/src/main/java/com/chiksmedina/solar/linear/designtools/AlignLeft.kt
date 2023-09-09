package com.chiksmedina.solar.linear.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.DesignToolsGroup

public val DesignToolsGroup.AlignLeft: ImageVector
    get() {
        if (_alignLeft != null) {
            return _alignLeft!!
        }
        _alignLeft = Builder(name = "AlignLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 2.0f)
                verticalLineTo(22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 7.5f)
                curveTo(7.0f, 6.5654f, 7.0f, 6.0981f, 7.201f, 5.75f)
                curveTo(7.3326f, 5.522f, 7.522f, 5.3326f, 7.75f, 5.201f)
                curveTo(8.0981f, 5.0f, 8.5654f, 5.0f, 9.5f, 5.0f)
                horizontalLineTo(18.5f)
                curveTo(19.4346f, 5.0f, 19.9019f, 5.0f, 20.25f, 5.201f)
                curveTo(20.478f, 5.3326f, 20.6674f, 5.522f, 20.799f, 5.75f)
                curveTo(21.0f, 6.0981f, 21.0f, 6.5654f, 21.0f, 7.5f)
                curveTo(21.0f, 8.4346f, 21.0f, 8.9019f, 20.799f, 9.25f)
                curveTo(20.6674f, 9.478f, 20.478f, 9.6674f, 20.25f, 9.799f)
                curveTo(19.9019f, 10.0f, 19.4346f, 10.0f, 18.5f, 10.0f)
                horizontalLineTo(9.5f)
                curveTo(8.5654f, 10.0f, 8.0981f, 10.0f, 7.75f, 9.799f)
                curveTo(7.522f, 9.6674f, 7.3326f, 9.478f, 7.201f, 9.25f)
                curveTo(7.0f, 8.9019f, 7.0f, 8.4346f, 7.0f, 7.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 16.5f)
                curveTo(7.0f, 15.5654f, 7.0f, 15.0981f, 7.201f, 14.75f)
                curveTo(7.3326f, 14.522f, 7.522f, 14.3326f, 7.75f, 14.201f)
                curveTo(8.0981f, 14.0f, 8.5654f, 14.0f, 9.5f, 14.0f)
                horizontalLineTo(15.5f)
                curveTo(16.4346f, 14.0f, 16.9019f, 14.0f, 17.25f, 14.201f)
                curveTo(17.478f, 14.3326f, 17.6674f, 14.522f, 17.799f, 14.75f)
                curveTo(18.0f, 15.0981f, 18.0f, 15.5654f, 18.0f, 16.5f)
                curveTo(18.0f, 17.4346f, 18.0f, 17.9019f, 17.799f, 18.25f)
                curveTo(17.6674f, 18.478f, 17.478f, 18.6674f, 17.25f, 18.799f)
                curveTo(16.9019f, 19.0f, 16.4346f, 19.0f, 15.5f, 19.0f)
                horizontalLineTo(9.5f)
                curveTo(8.5654f, 19.0f, 8.0981f, 19.0f, 7.75f, 18.799f)
                curveTo(7.522f, 18.6674f, 7.3326f, 18.478f, 7.201f, 18.25f)
                curveTo(7.0f, 17.9019f, 7.0f, 17.4346f, 7.0f, 16.5f)
                close()
            }
        }
        .build()
        return _alignLeft!!
    }

private var _alignLeft: ImageVector? = null
