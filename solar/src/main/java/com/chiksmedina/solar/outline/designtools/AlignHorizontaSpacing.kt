package com.chiksmedina.solar.outline.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.DesignToolsGroup

public val DesignToolsGroup.AlignHorizontaSpacing: ImageVector
    get() {
        if (_alignHorizontaSpacing != null) {
            return _alignHorizontaSpacing!!
        }
        _alignHorizontaSpacing = Builder(name = "AlignHorizontaSpacing", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 1.25f)
                curveTo(3.4142f, 1.25f, 3.75f, 1.5858f, 3.75f, 2.0f)
                lineTo(3.75f, 22.0f)
                curveTo(3.75f, 22.4142f, 3.4142f, 22.75f, 3.0f, 22.75f)
                curveTo(2.5858f, 22.75f, 2.25f, 22.4142f, 2.25f, 22.0f)
                lineTo(2.25f, 2.0f)
                curveTo(2.25f, 1.5858f, 2.5858f, 1.25f, 3.0f, 1.25f)
                close()
                moveTo(21.0f, 1.25f)
                curveTo(21.4142f, 1.25f, 21.75f, 1.5858f, 21.75f, 2.0f)
                lineTo(21.75f, 22.0f)
                curveTo(21.75f, 22.4142f, 21.4142f, 22.75f, 21.0f, 22.75f)
                curveTo(20.5858f, 22.75f, 20.25f, 22.4142f, 20.25f, 22.0f)
                lineTo(20.25f, 2.0f)
                curveTo(20.25f, 1.5858f, 20.5858f, 1.25f, 21.0f, 1.25f)
                close()
                moveTo(11.948f, 3.25f)
                horizontalLineTo(12.052f)
                curveTo(12.9505f, 3.25f, 13.6997f, 3.2499f, 14.2945f, 3.3299f)
                curveTo(14.9223f, 3.4143f, 15.4891f, 3.6f, 15.9445f, 4.0555f)
                curveTo(16.4f, 4.5109f, 16.5857f, 5.0777f, 16.6701f, 5.7055f)
                curveTo(16.7501f, 6.3003f, 16.75f, 7.0495f, 16.75f, 7.948f)
                verticalLineTo(16.052f)
                curveTo(16.75f, 16.9505f, 16.7501f, 17.6997f, 16.6701f, 18.2945f)
                curveTo(16.5857f, 18.9223f, 16.4f, 19.4891f, 15.9445f, 19.9445f)
                curveTo(15.4891f, 20.4f, 14.9223f, 20.5857f, 14.2945f, 20.6701f)
                curveTo(13.6997f, 20.7501f, 12.9505f, 20.75f, 12.052f, 20.75f)
                horizontalLineTo(11.948f)
                curveTo(11.0495f, 20.75f, 10.3003f, 20.7501f, 9.7055f, 20.6701f)
                curveTo(9.0777f, 20.5857f, 8.5109f, 20.4f, 8.0555f, 19.9445f)
                curveTo(7.6f, 19.4891f, 7.4143f, 18.9223f, 7.3299f, 18.2945f)
                curveTo(7.2499f, 17.6997f, 7.25f, 16.9505f, 7.25f, 16.052f)
                verticalLineTo(7.948f)
                curveTo(7.25f, 7.0495f, 7.2499f, 6.3003f, 7.3299f, 5.7055f)
                curveTo(7.4143f, 5.0777f, 7.6f, 4.5109f, 8.0555f, 4.0555f)
                curveTo(8.5109f, 3.6f, 9.0777f, 3.4143f, 9.7055f, 3.3299f)
                curveTo(10.3003f, 3.2499f, 11.0495f, 3.25f, 11.948f, 3.25f)
                close()
                moveTo(9.9054f, 4.8165f)
                curveTo(9.4439f, 4.8786f, 9.2464f, 4.9858f, 9.1161f, 5.1161f)
                curveTo(8.9858f, 5.2464f, 8.8786f, 5.4439f, 8.8165f, 5.9054f)
                curveTo(8.7516f, 6.3884f, 8.75f, 7.036f, 8.75f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(8.75f, 16.964f, 8.7516f, 17.6116f, 8.8165f, 18.0946f)
                curveTo(8.8786f, 18.5561f, 8.9858f, 18.7536f, 9.1161f, 18.8839f)
                curveTo(9.2464f, 19.0142f, 9.4439f, 19.1214f, 9.9054f, 19.1835f)
                curveTo(10.3884f, 19.2484f, 11.036f, 19.25f, 12.0f, 19.25f)
                curveTo(12.964f, 19.25f, 13.6116f, 19.2484f, 14.0946f, 19.1835f)
                curveTo(14.5561f, 19.1214f, 14.7536f, 19.0142f, 14.8839f, 18.8839f)
                curveTo(15.0142f, 18.7536f, 15.1214f, 18.5561f, 15.1835f, 18.0946f)
                curveTo(15.2484f, 17.6116f, 15.25f, 16.964f, 15.25f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(15.25f, 7.036f, 15.2484f, 6.3884f, 15.1835f, 5.9054f)
                curveTo(15.1214f, 5.4439f, 15.0142f, 5.2464f, 14.8839f, 5.1161f)
                curveTo(14.7536f, 4.9858f, 14.5561f, 4.8786f, 14.0946f, 4.8165f)
                curveTo(13.6116f, 4.7516f, 12.964f, 4.75f, 12.0f, 4.75f)
                curveTo(11.036f, 4.75f, 10.3884f, 4.7516f, 9.9054f, 4.8165f)
                close()
            }
        }
        .build()
        return _alignHorizontaSpacing!!
    }

private var _alignHorizontaSpacing: ImageVector? = null
