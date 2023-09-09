package com.chiksmedina.solar.broken.designtools

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
import com.chiksmedina.solar.broken.DesignToolsGroup

public val DesignToolsGroup.AlignTop: ImageVector
    get() {
        if (_alignTop != null) {
            return _alignTop!!
        }
        _alignTop = Builder(name = "AlignTop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 3.0f)
                lineTo(22.0f, 3.0f)
                moveTo(2.0f, 3.0f)
                lineTo(6.0f, 3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 13.0f)
                verticalLineTo(18.5f)
                curveTo(5.0f, 19.4346f, 5.0f, 19.9019f, 5.201f, 20.25f)
                curveTo(5.3326f, 20.478f, 5.522f, 20.6674f, 5.75f, 20.799f)
                curveTo(6.0981f, 21.0f, 6.5654f, 21.0f, 7.5f, 21.0f)
                curveTo(8.4346f, 21.0f, 8.9019f, 21.0f, 9.25f, 20.799f)
                curveTo(9.478f, 20.6674f, 9.6674f, 20.478f, 9.799f, 20.25f)
                curveTo(10.0f, 19.9019f, 10.0f, 19.4346f, 10.0f, 18.5f)
                lineTo(10.0f, 9.5f)
                curveTo(10.0f, 8.5654f, 10.0f, 8.0981f, 9.799f, 7.75f)
                curveTo(9.6674f, 7.522f, 9.478f, 7.3326f, 9.25f, 7.201f)
                curveTo(8.9019f, 7.0f, 8.4346f, 7.0f, 7.5f, 7.0f)
                curveTo(6.5654f, 7.0f, 6.0981f, 7.0f, 5.75f, 7.201f)
                curveTo(5.522f, 7.3326f, 5.3326f, 7.522f, 5.201f, 7.75f)
                curveTo(5.0395f, 8.0296f, 5.0078f, 8.3861f, 5.0015f, 9.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.5f, 7.0f)
                curveTo(15.5654f, 7.0f, 15.0981f, 7.0f, 14.75f, 7.201f)
                curveTo(14.522f, 7.3326f, 14.3326f, 7.522f, 14.201f, 7.75f)
                curveTo(14.0f, 8.0981f, 14.0f, 8.5654f, 14.0f, 9.5f)
                lineTo(14.0f, 15.5f)
                curveTo(14.0f, 16.4346f, 14.0f, 16.9019f, 14.201f, 17.25f)
                curveTo(14.3326f, 17.478f, 14.522f, 17.6674f, 14.75f, 17.799f)
                curveTo(15.0981f, 18.0f, 15.5654f, 18.0f, 16.5f, 18.0f)
                curveTo(17.4346f, 18.0f, 17.9019f, 18.0f, 18.25f, 17.799f)
                curveTo(18.478f, 17.6674f, 18.6674f, 17.478f, 18.799f, 17.25f)
                curveTo(19.0f, 16.9019f, 19.0f, 16.4346f, 19.0f, 15.5f)
                lineTo(19.0f, 9.5f)
                curveTo(19.0f, 8.5654f, 19.0f, 8.0981f, 18.799f, 7.75f)
                curveTo(18.6674f, 7.522f, 18.478f, 7.3326f, 18.25f, 7.201f)
                curveTo(17.9019f, 7.0f, 17.4346f, 7.0f, 16.5f, 7.0f)
                close()
            }
        }
        .build()
        return _alignTop!!
    }

private var _alignTop: ImageVector? = null
