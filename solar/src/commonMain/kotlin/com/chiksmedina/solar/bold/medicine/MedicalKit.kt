package com.chiksmedina.solar.bold.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.MedicineGroup

val MedicineGroup.MedicalKit: ImageVector
    get() {
        if (_medicalKit != null) {
            return _medicalKit!!
        }
        _medicalKit = Builder(
            name = "MedicalKit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 11.75f)
                curveTo(12.4142f, 11.75f, 12.75f, 12.0858f, 12.75f, 12.5f)
                verticalLineTo(13.25f)
                horizontalLineTo(13.5f)
                curveTo(13.9142f, 13.25f, 14.25f, 13.5858f, 14.25f, 14.0f)
                curveTo(14.25f, 14.4142f, 13.9142f, 14.75f, 13.5f, 14.75f)
                horizontalLineTo(12.75f)
                verticalLineTo(15.5f)
                curveTo(12.75f, 15.9142f, 12.4142f, 16.25f, 12.0f, 16.25f)
                curveTo(11.5858f, 16.25f, 11.25f, 15.9142f, 11.25f, 15.5f)
                verticalLineTo(14.75f)
                horizontalLineTo(10.5f)
                curveTo(10.0858f, 14.75f, 9.75f, 14.4142f, 9.75f, 14.0f)
                curveTo(9.75f, 13.5858f, 10.0858f, 13.25f, 10.5f, 13.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(12.5f)
                curveTo(11.25f, 12.0858f, 11.5858f, 11.75f, 12.0f, 11.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.948f, 1.25f)
                curveTo(11.0495f, 1.25f, 10.3003f, 1.25f, 9.7055f, 1.3299f)
                curveTo(9.0777f, 1.4143f, 8.5109f, 1.6f, 8.0555f, 2.0555f)
                curveTo(7.6f, 2.5109f, 7.4143f, 3.0777f, 7.3299f, 3.7055f)
                curveTo(7.2499f, 4.3003f, 7.25f, 5.0495f, 7.25f, 5.948f)
                lineTo(7.25f, 6.0257f)
                curveTo(5.2288f, 6.0918f, 4.0151f, 6.328f, 3.1716f, 7.1716f)
                curveTo(2.0f, 8.3432f, 2.0f, 10.2288f, 2.0f, 14.0f)
                curveTo(2.0f, 17.7712f, 2.0f, 19.6569f, 3.1716f, 20.8284f)
                curveTo(4.3431f, 22.0f, 6.2288f, 22.0f, 10.0f, 22.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 22.0f, 19.6569f, 22.0f, 20.8284f, 20.8284f)
                curveTo(22.0f, 19.6569f, 22.0f, 17.7712f, 22.0f, 14.0f)
                curveTo(22.0f, 10.2288f, 22.0f, 8.3432f, 20.8284f, 7.1716f)
                curveTo(19.9849f, 6.328f, 18.7712f, 6.0918f, 16.75f, 6.0257f)
                lineTo(16.75f, 5.948f)
                curveTo(16.75f, 5.0495f, 16.7501f, 4.3003f, 16.6701f, 3.7055f)
                curveTo(16.5857f, 3.0777f, 16.4f, 2.5109f, 15.9445f, 2.0555f)
                curveTo(15.4891f, 1.6f, 14.9223f, 1.4143f, 14.2945f, 1.3299f)
                curveTo(13.6997f, 1.25f, 12.9505f, 1.25f, 12.052f, 1.25f)
                horizontalLineTo(11.948f)
                close()
                moveTo(15.25f, 6.0019f)
                verticalLineTo(6.0f)
                curveTo(15.25f, 5.036f, 15.2484f, 4.3884f, 15.1835f, 3.9054f)
                curveTo(15.1214f, 3.4439f, 15.0142f, 3.2464f, 14.8839f, 3.1161f)
                curveTo(14.7536f, 2.9858f, 14.5561f, 2.8786f, 14.0946f, 2.8165f)
                curveTo(13.6116f, 2.7516f, 12.964f, 2.75f, 12.0f, 2.75f)
                curveTo(11.036f, 2.75f, 10.3884f, 2.7516f, 9.9054f, 2.8165f)
                curveTo(9.4439f, 2.8786f, 9.2464f, 2.9858f, 9.1161f, 3.1161f)
                curveTo(8.9858f, 3.2464f, 8.8786f, 3.4439f, 8.8165f, 3.9054f)
                curveTo(8.7516f, 4.3884f, 8.75f, 5.036f, 8.75f, 6.0f)
                verticalLineTo(6.0019f)
                curveTo(9.142f, 6.0f, 9.5581f, 6.0f, 10.0f, 6.0f)
                horizontalLineTo(14.0f)
                curveTo(14.4419f, 6.0f, 14.858f, 6.0f, 15.25f, 6.0019f)
                close()
                moveTo(16.0f, 14.0f)
                curveTo(16.0f, 16.2091f, 14.2091f, 18.0f, 12.0f, 18.0f)
                curveTo(9.7909f, 18.0f, 8.0f, 16.2091f, 8.0f, 14.0f)
                curveTo(8.0f, 11.7909f, 9.7909f, 10.0f, 12.0f, 10.0f)
                curveTo(14.2091f, 10.0f, 16.0f, 11.7909f, 16.0f, 14.0f)
                close()
            }
        }
            .build()
        return _medicalKit!!
    }

private var _medicalKit: ImageVector? = null
