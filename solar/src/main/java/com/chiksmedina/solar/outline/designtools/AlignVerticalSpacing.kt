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

val DesignToolsGroup.AlignVerticalSpacing: ImageVector
    get() {
        if (_alignVerticalSpacing != null) {
            return _alignVerticalSpacing!!
        }
        _alignVerticalSpacing = Builder(
            name = "AlignVerticalSpacing", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(1.25f, 3.0f)
                curveTo(1.25f, 2.5858f, 1.5858f, 2.25f, 2.0f, 2.25f)
                lineTo(22.0f, 2.25f)
                curveTo(22.4142f, 2.25f, 22.75f, 2.5858f, 22.75f, 3.0f)
                curveTo(22.75f, 3.4142f, 22.4142f, 3.75f, 22.0f, 3.75f)
                lineTo(2.0f, 3.75f)
                curveTo(1.5858f, 3.75f, 1.25f, 3.4142f, 1.25f, 3.0f)
                close()
                moveTo(7.948f, 7.25f)
                horizontalLineTo(16.052f)
                curveTo(16.9505f, 7.25f, 17.6997f, 7.2499f, 18.2945f, 7.3299f)
                curveTo(18.9223f, 7.4143f, 19.4891f, 7.6f, 19.9445f, 8.0555f)
                curveTo(20.4f, 8.5109f, 20.5857f, 9.0777f, 20.6701f, 9.7055f)
                curveTo(20.7501f, 10.3003f, 20.75f, 11.0495f, 20.75f, 11.948f)
                verticalLineTo(12.052f)
                curveTo(20.75f, 12.9505f, 20.7501f, 13.6997f, 20.6701f, 14.2945f)
                curveTo(20.5857f, 14.9223f, 20.4f, 15.4891f, 19.9445f, 15.9445f)
                curveTo(19.4891f, 16.4f, 18.9223f, 16.5857f, 18.2945f, 16.6701f)
                curveTo(17.6997f, 16.7501f, 16.9505f, 16.75f, 16.052f, 16.75f)
                horizontalLineTo(7.948f)
                curveTo(7.0495f, 16.75f, 6.3003f, 16.7501f, 5.7055f, 16.6701f)
                curveTo(5.0777f, 16.5857f, 4.5109f, 16.4f, 4.0555f, 15.9445f)
                curveTo(3.6f, 15.4891f, 3.4143f, 14.9223f, 3.3299f, 14.2945f)
                curveTo(3.2499f, 13.6997f, 3.25f, 12.9505f, 3.25f, 12.052f)
                verticalLineTo(11.948f)
                curveTo(3.25f, 11.0495f, 3.2499f, 10.3003f, 3.3299f, 9.7055f)
                curveTo(3.4143f, 9.0777f, 3.6f, 8.5109f, 4.0555f, 8.0555f)
                curveTo(4.5109f, 7.6f, 5.0777f, 7.4143f, 5.7055f, 7.3299f)
                curveTo(6.3003f, 7.2499f, 7.0495f, 7.25f, 7.948f, 7.25f)
                close()
                moveTo(5.9054f, 8.8165f)
                curveTo(5.4439f, 8.8786f, 5.2464f, 8.9858f, 5.1161f, 9.1161f)
                curveTo(4.9858f, 9.2464f, 4.8786f, 9.4439f, 4.8165f, 9.9054f)
                curveTo(4.7516f, 10.3884f, 4.75f, 11.036f, 4.75f, 12.0f)
                curveTo(4.75f, 12.964f, 4.7516f, 13.6116f, 4.8165f, 14.0946f)
                curveTo(4.8786f, 14.5561f, 4.9858f, 14.7536f, 5.1161f, 14.8839f)
                curveTo(5.2464f, 15.0142f, 5.4439f, 15.1214f, 5.9054f, 15.1835f)
                curveTo(6.3884f, 15.2484f, 7.036f, 15.25f, 8.0f, 15.25f)
                horizontalLineTo(16.0f)
                curveTo(16.964f, 15.25f, 17.6116f, 15.2484f, 18.0946f, 15.1835f)
                curveTo(18.5561f, 15.1214f, 18.7536f, 15.0142f, 18.8839f, 14.8839f)
                curveTo(19.0142f, 14.7536f, 19.1214f, 14.5561f, 19.1835f, 14.0946f)
                curveTo(19.2484f, 13.6116f, 19.25f, 12.964f, 19.25f, 12.0f)
                curveTo(19.25f, 11.036f, 19.2484f, 10.3884f, 19.1835f, 9.9054f)
                curveTo(19.1214f, 9.4439f, 19.0142f, 9.2464f, 18.8839f, 9.1161f)
                curveTo(18.7536f, 8.9858f, 18.5561f, 8.8786f, 18.0946f, 8.8165f)
                curveTo(17.6116f, 8.7516f, 16.964f, 8.75f, 16.0f, 8.75f)
                horizontalLineTo(8.0f)
                curveTo(7.036f, 8.75f, 6.3884f, 8.7516f, 5.9054f, 8.8165f)
                close()
                moveTo(1.25f, 21.0f)
                curveTo(1.25f, 20.5858f, 1.5858f, 20.25f, 2.0f, 20.25f)
                lineTo(22.0f, 20.25f)
                curveTo(22.4142f, 20.25f, 22.75f, 20.5858f, 22.75f, 21.0f)
                curveTo(22.75f, 21.4142f, 22.4142f, 21.75f, 22.0f, 21.75f)
                lineTo(2.0f, 21.75f)
                curveTo(1.5858f, 21.75f, 1.25f, 21.4142f, 1.25f, 21.0f)
                close()
            }
        }
            .build()
        return _alignVerticalSpacing!!
    }

private var _alignVerticalSpacing: ImageVector? = null
