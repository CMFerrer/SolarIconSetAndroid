package com.chiksmedina.solar.outline.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import com.chiksmedina.solar.outline.MedicineGroup

public val MedicineGroup.DropperMinimalistic: ImageVector
    get() {
        if (_dropperMinimalistic != null) {
            return _dropperMinimalistic!!
        }
        _dropperMinimalistic = Builder(name = "DropperMinimalistic", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 8.0f)
                lineTo(17.0f, 8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 14.0f)
                horizontalLineTo(17.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 11.0f)
                horizontalLineTo(17.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.1752f, 9.1014f)
                curveTo(12.5324f, 8.4232f, 11.4676f, 8.4232f, 10.8248f, 9.1014f)
                curveTo(10.5172f, 9.426f, 10.1419f, 9.8566f, 9.8388f, 10.3157f)
                curveTo(9.5544f, 10.7466f, 9.25f, 11.3242f, 9.25f, 11.9166f)
                curveTo(9.25f, 13.4523f, 10.4527f, 14.7499f, 12.0f, 14.7499f)
                curveTo(13.5473f, 14.7499f, 14.75f, 13.4523f, 14.75f, 11.9166f)
                curveTo(14.75f, 11.3242f, 14.4456f, 10.7466f, 14.1612f, 10.3157f)
                curveTo(13.8581f, 9.8566f, 13.4828f, 9.426f, 13.1752f, 9.1014f)
                close()
                moveTo(11.9135f, 10.1333f)
                curveTo(11.9428f, 10.1024f, 11.9734f, 10.0928f, 12.0f, 10.0928f)
                curveTo(12.0266f, 10.0928f, 12.0572f, 10.1024f, 12.0865f, 10.1333f)
                curveTo(12.3651f, 10.4272f, 12.6744f, 10.7862f, 12.9093f, 11.1421f)
                curveTo(13.1629f, 11.5263f, 13.25f, 11.7891f, 13.25f, 11.9166f)
                curveTo(13.25f, 12.6821f, 12.6618f, 13.2499f, 12.0f, 13.2499f)
                curveTo(11.3382f, 13.2499f, 10.75f, 12.6821f, 10.75f, 11.9166f)
                curveTo(10.75f, 11.7891f, 10.8371f, 11.5263f, 11.0907f, 11.1421f)
                curveTo(11.3256f, 10.7862f, 11.6349f, 10.4272f, 11.9135f, 10.1333f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.3535f, 3.25f)
                curveTo(9.68f, 2.0958f, 10.7412f, 1.25f, 12.0f, 1.25f)
                curveTo(13.2588f, 1.25f, 14.32f, 2.0958f, 14.6465f, 3.25f)
                lineTo(15.052f, 3.25f)
                curveTo(15.9505f, 3.25f, 16.6997f, 3.2499f, 17.2945f, 3.3299f)
                curveTo(17.9223f, 3.4143f, 18.4891f, 3.6f, 18.9445f, 4.0555f)
                curveTo(19.4f, 4.5109f, 19.5857f, 5.0777f, 19.6701f, 5.7055f)
                curveTo(19.7501f, 6.3003f, 19.75f, 7.0495f, 19.75f, 7.948f)
                lineTo(19.75f, 15.8831f)
                curveTo(19.75f, 16.8539f, 19.3428f, 17.7803f, 18.6274f, 18.4367f)
                curveTo(16.9503f, 19.9756f, 14.8713f, 20.826f, 12.7499f, 20.988f)
                lineTo(12.75f, 21.0f)
                verticalLineTo(22.0f)
                curveTo(12.75f, 22.4142f, 12.4142f, 22.75f, 12.0f, 22.75f)
                curveTo(11.5858f, 22.75f, 11.25f, 22.4142f, 11.25f, 22.0f)
                verticalLineTo(21.0f)
                lineTo(11.2501f, 20.988f)
                curveTo(9.1287f, 20.826f, 7.0497f, 19.9756f, 5.3726f, 18.4367f)
                curveTo(4.6572f, 17.7803f, 4.25f, 16.8539f, 4.25f, 15.8831f)
                lineTo(4.25f, 7.948f)
                curveTo(4.25f, 7.0495f, 4.2499f, 6.3003f, 4.3299f, 5.7055f)
                curveTo(4.4143f, 5.0777f, 4.6f, 4.5109f, 5.0555f, 4.0555f)
                curveTo(5.5109f, 3.6f, 6.0777f, 3.4143f, 6.7055f, 3.3299f)
                curveTo(7.3003f, 3.2499f, 8.0495f, 3.25f, 8.948f, 3.25f)
                lineTo(9.3535f, 3.25f)
                close()
                moveTo(10.9999f, 3.25f)
                curveTo(11.228f, 2.9464f, 11.591f, 2.75f, 12.0f, 2.75f)
                curveTo(12.409f, 2.75f, 12.772f, 2.9464f, 13.0001f, 3.25f)
                horizontalLineTo(10.9999f)
                close()
                moveTo(9.0f, 4.75f)
                curveTo(8.036f, 4.75f, 7.3884f, 4.7516f, 6.9054f, 4.8165f)
                curveTo(6.4439f, 4.8786f, 6.2464f, 4.9858f, 6.1161f, 5.1161f)
                curveTo(5.9858f, 5.2464f, 5.8786f, 5.4439f, 5.8165f, 5.9054f)
                curveTo(5.7516f, 6.3884f, 5.75f, 7.036f, 5.75f, 8.0f)
                verticalLineTo(15.8831f)
                curveTo(5.75f, 16.4337f, 5.981f, 16.9592f, 6.3867f, 17.3315f)
                curveTo(9.5618f, 20.2449f, 14.4382f, 20.2449f, 17.6133f, 17.3315f)
                curveTo(18.019f, 16.9592f, 18.25f, 16.4337f, 18.25f, 15.8831f)
                verticalLineTo(8.0f)
                curveTo(18.25f, 7.036f, 18.2484f, 6.3884f, 18.1835f, 5.9054f)
                curveTo(18.1214f, 5.4439f, 18.0142f, 5.2464f, 17.8839f, 5.1161f)
                curveTo(17.7536f, 4.9858f, 17.5561f, 4.8786f, 17.0946f, 4.8165f)
                curveTo(16.6116f, 4.7516f, 15.964f, 4.75f, 15.0f, 4.75f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _dropperMinimalistic!!
    }

private var _dropperMinimalistic: ImageVector? = null
