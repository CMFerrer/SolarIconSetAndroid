package com.chiksmedina.solar.outline.settingsfinetuning

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.SettingsFineTuningGroup

val SettingsFineTuningGroup.Widget: ImageVector
    get() {
        if (_widget != null) {
            return _widget!!
        }
        _widget = Builder(
            name = "Widget", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(6.448f, 1.75f)
                curveTo(5.5495f, 1.75f, 4.8003f, 1.75f, 4.2055f, 1.8299f)
                curveTo(3.5777f, 1.9143f, 3.0109f, 2.1f, 2.5555f, 2.5555f)
                curveTo(2.1f, 3.0109f, 1.9143f, 3.5777f, 1.8299f, 4.2055f)
                curveTo(1.75f, 4.8003f, 1.75f, 5.5495f, 1.75f, 6.448f)
                verticalLineTo(6.552f)
                curveTo(1.75f, 7.4505f, 1.75f, 8.1997f, 1.8299f, 8.7945f)
                curveTo(1.9143f, 9.4223f, 2.1f, 9.9891f, 2.5555f, 10.4445f)
                curveTo(3.0109f, 10.9f, 3.5777f, 11.0857f, 4.2055f, 11.1701f)
                curveTo(4.8003f, 11.2501f, 5.5495f, 11.25f, 6.448f, 11.25f)
                horizontalLineTo(6.552f)
                curveTo(7.4505f, 11.25f, 8.1997f, 11.2501f, 8.7945f, 11.1701f)
                curveTo(9.4223f, 11.0857f, 9.9891f, 10.9f, 10.4445f, 10.4445f)
                curveTo(10.9f, 9.9891f, 11.0857f, 9.4223f, 11.1701f, 8.7945f)
                curveTo(11.2501f, 8.1997f, 11.25f, 7.4505f, 11.25f, 6.552f)
                verticalLineTo(6.448f)
                curveTo(11.25f, 5.5495f, 11.2501f, 4.8003f, 11.1701f, 4.2055f)
                curveTo(11.0857f, 3.5777f, 10.9f, 3.0109f, 10.4445f, 2.5555f)
                curveTo(9.9891f, 2.1f, 9.4223f, 1.9143f, 8.7945f, 1.8299f)
                curveTo(8.1997f, 1.75f, 7.4505f, 1.75f, 6.552f, 1.75f)
                horizontalLineTo(6.448f)
                close()
                moveTo(3.6161f, 3.6161f)
                curveTo(3.7464f, 3.4858f, 3.9439f, 3.3786f, 4.4054f, 3.3165f)
                curveTo(4.8884f, 3.2516f, 5.536f, 3.25f, 6.5f, 3.25f)
                curveTo(7.464f, 3.25f, 8.1116f, 3.2516f, 8.5946f, 3.3165f)
                curveTo(9.0561f, 3.3786f, 9.2536f, 3.4858f, 9.3839f, 3.6161f)
                curveTo(9.5142f, 3.7464f, 9.6214f, 3.9439f, 9.6835f, 4.4054f)
                curveTo(9.7484f, 4.8884f, 9.75f, 5.536f, 9.75f, 6.5f)
                curveTo(9.75f, 7.464f, 9.7484f, 8.1116f, 9.6835f, 8.5946f)
                curveTo(9.6214f, 9.0561f, 9.5142f, 9.2536f, 9.3839f, 9.3839f)
                curveTo(9.2536f, 9.5142f, 9.0561f, 9.6214f, 8.5946f, 9.6835f)
                curveTo(8.1116f, 9.7484f, 7.464f, 9.75f, 6.5f, 9.75f)
                curveTo(5.536f, 9.75f, 4.8884f, 9.7484f, 4.4054f, 9.6835f)
                curveTo(3.9439f, 9.6214f, 3.7464f, 9.5142f, 3.6161f, 9.3839f)
                curveTo(3.4858f, 9.2536f, 3.3786f, 9.0561f, 3.3165f, 8.5946f)
                curveTo(3.2516f, 8.1116f, 3.25f, 7.464f, 3.25f, 6.5f)
                curveTo(3.25f, 5.536f, 3.2516f, 4.8884f, 3.3165f, 4.4054f)
                curveTo(3.3786f, 3.9439f, 3.4858f, 3.7464f, 3.6161f, 3.6161f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(17.448f, 12.75f)
                curveTo(16.5495f, 12.75f, 15.8003f, 12.7499f, 15.2055f, 12.8299f)
                curveTo(14.5777f, 12.9143f, 14.0109f, 13.1f, 13.5555f, 13.5555f)
                curveTo(13.1f, 14.0109f, 12.9143f, 14.5777f, 12.8299f, 15.2055f)
                curveTo(12.7499f, 15.8003f, 12.75f, 16.5495f, 12.75f, 17.448f)
                verticalLineTo(17.552f)
                curveTo(12.75f, 18.4505f, 12.7499f, 19.1997f, 12.8299f, 19.7945f)
                curveTo(12.9143f, 20.4223f, 13.1f, 20.9891f, 13.5555f, 21.4445f)
                curveTo(14.0109f, 21.9f, 14.5777f, 22.0857f, 15.2055f, 22.1701f)
                curveTo(15.8003f, 22.2501f, 16.5495f, 22.25f, 17.4479f, 22.25f)
                horizontalLineTo(17.552f)
                curveTo(18.4504f, 22.25f, 19.1997f, 22.2501f, 19.7945f, 22.1701f)
                curveTo(20.4223f, 22.0857f, 20.9891f, 21.9f, 21.4445f, 21.4445f)
                curveTo(21.9f, 20.9891f, 22.0857f, 20.4223f, 22.1701f, 19.7945f)
                curveTo(22.2501f, 19.1997f, 22.25f, 18.4505f, 22.25f, 17.5521f)
                verticalLineTo(17.448f)
                curveTo(22.25f, 16.5496f, 22.2501f, 15.8003f, 22.1701f, 15.2055f)
                curveTo(22.0857f, 14.5777f, 21.9f, 14.0109f, 21.4445f, 13.5555f)
                curveTo(20.9891f, 13.1f, 20.4223f, 12.9143f, 19.7945f, 12.8299f)
                curveTo(19.1997f, 12.7499f, 18.4505f, 12.75f, 17.552f, 12.75f)
                horizontalLineTo(17.448f)
                close()
                moveTo(14.6161f, 14.6161f)
                curveTo(14.7464f, 14.4858f, 14.9439f, 14.3786f, 15.4054f, 14.3165f)
                curveTo(15.8884f, 14.2516f, 16.536f, 14.25f, 17.5f, 14.25f)
                curveTo(18.464f, 14.25f, 19.1116f, 14.2516f, 19.5946f, 14.3165f)
                curveTo(20.0561f, 14.3786f, 20.2536f, 14.4858f, 20.3839f, 14.6161f)
                curveTo(20.5142f, 14.7464f, 20.6214f, 14.9439f, 20.6835f, 15.4054f)
                curveTo(20.7484f, 15.8884f, 20.75f, 16.536f, 20.75f, 17.5f)
                curveTo(20.75f, 18.464f, 20.7484f, 19.1116f, 20.6835f, 19.5946f)
                curveTo(20.6214f, 20.0561f, 20.5142f, 20.2536f, 20.3839f, 20.3839f)
                curveTo(20.2536f, 20.5142f, 20.0561f, 20.6214f, 19.5946f, 20.6835f)
                curveTo(19.1116f, 20.7484f, 18.464f, 20.75f, 17.5f, 20.75f)
                curveTo(16.536f, 20.75f, 15.8884f, 20.7484f, 15.4054f, 20.6835f)
                curveTo(14.9439f, 20.6214f, 14.7464f, 20.5142f, 14.6161f, 20.3839f)
                curveTo(14.4858f, 20.2536f, 14.3786f, 20.0561f, 14.3165f, 19.5946f)
                curveTo(14.2516f, 19.1116f, 14.25f, 18.464f, 14.25f, 17.5f)
                curveTo(14.25f, 16.536f, 14.2516f, 15.8884f, 14.3165f, 15.4054f)
                curveTo(14.3786f, 14.9439f, 14.4858f, 14.7464f, 14.6161f, 14.6161f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(6.448f, 12.75f)
                horizontalLineTo(6.552f)
                curveTo(7.4505f, 12.75f, 8.1997f, 12.7499f, 8.7945f, 12.8299f)
                curveTo(9.4223f, 12.9143f, 9.9891f, 13.1f, 10.4445f, 13.5555f)
                curveTo(10.9f, 14.0109f, 11.0857f, 14.5777f, 11.1701f, 15.2055f)
                curveTo(11.2501f, 15.8003f, 11.25f, 16.5495f, 11.25f, 17.448f)
                verticalLineTo(17.552f)
                curveTo(11.25f, 18.4505f, 11.2501f, 19.1997f, 11.1701f, 19.7945f)
                curveTo(11.0857f, 20.4223f, 10.9f, 20.9891f, 10.4445f, 21.4445f)
                curveTo(9.9891f, 21.9f, 9.4223f, 22.0857f, 8.7945f, 22.1701f)
                curveTo(8.1997f, 22.2501f, 7.4505f, 22.25f, 6.5521f, 22.25f)
                horizontalLineTo(6.448f)
                curveTo(5.5496f, 22.25f, 4.8003f, 22.2501f, 4.2055f, 22.1701f)
                curveTo(3.5777f, 22.0857f, 3.0109f, 21.9f, 2.5555f, 21.4445f)
                curveTo(2.1f, 20.9891f, 1.9143f, 20.4223f, 1.8299f, 19.7945f)
                curveTo(1.75f, 19.1997f, 1.75f, 18.4505f, 1.75f, 17.552f)
                verticalLineTo(17.448f)
                curveTo(1.75f, 16.5495f, 1.75f, 15.8003f, 1.8299f, 15.2055f)
                curveTo(1.9143f, 14.5777f, 2.1f, 14.0109f, 2.5555f, 13.5555f)
                curveTo(3.0109f, 13.1f, 3.5777f, 12.9143f, 4.2055f, 12.8299f)
                curveTo(4.8003f, 12.7499f, 5.5495f, 12.75f, 6.448f, 12.75f)
                close()
                moveTo(4.4054f, 14.3165f)
                curveTo(3.9439f, 14.3786f, 3.7464f, 14.4858f, 3.6161f, 14.6161f)
                curveTo(3.4858f, 14.7464f, 3.3786f, 14.9439f, 3.3165f, 15.4054f)
                curveTo(3.2516f, 15.8884f, 3.25f, 16.536f, 3.25f, 17.5f)
                curveTo(3.25f, 18.464f, 3.2516f, 19.1116f, 3.3165f, 19.5946f)
                curveTo(3.3786f, 20.0561f, 3.4858f, 20.2536f, 3.6161f, 20.3839f)
                curveTo(3.7464f, 20.5142f, 3.9439f, 20.6214f, 4.4054f, 20.6835f)
                curveTo(4.8884f, 20.7484f, 5.536f, 20.75f, 6.5f, 20.75f)
                curveTo(7.464f, 20.75f, 8.1116f, 20.7484f, 8.5946f, 20.6835f)
                curveTo(9.0561f, 20.6214f, 9.2536f, 20.5142f, 9.3839f, 20.3839f)
                curveTo(9.5142f, 20.2536f, 9.6214f, 20.0561f, 9.6835f, 19.5946f)
                curveTo(9.7484f, 19.1116f, 9.75f, 18.464f, 9.75f, 17.5f)
                curveTo(9.75f, 16.536f, 9.7484f, 15.8884f, 9.6835f, 15.4054f)
                curveTo(9.6214f, 14.9439f, 9.5142f, 14.7464f, 9.3839f, 14.6161f)
                curveTo(9.2536f, 14.4858f, 9.0561f, 14.3786f, 8.5946f, 14.3165f)
                curveTo(8.1116f, 14.2516f, 7.464f, 14.25f, 6.5f, 14.25f)
                curveTo(5.536f, 14.25f, 4.8884f, 14.2516f, 4.4054f, 14.3165f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(17.448f, 1.75f)
                curveTo(16.5495f, 1.75f, 15.8003f, 1.75f, 15.2055f, 1.8299f)
                curveTo(14.5777f, 1.9143f, 14.0109f, 2.1f, 13.5555f, 2.5555f)
                curveTo(13.1f, 3.0109f, 12.9143f, 3.5777f, 12.8299f, 4.2055f)
                curveTo(12.7499f, 4.8003f, 12.75f, 5.5495f, 12.75f, 6.448f)
                verticalLineTo(6.552f)
                curveTo(12.75f, 7.4505f, 12.7499f, 8.1997f, 12.8299f, 8.7945f)
                curveTo(12.9143f, 9.4223f, 13.1f, 9.9891f, 13.5555f, 10.4445f)
                curveTo(14.0109f, 10.9f, 14.5777f, 11.0857f, 15.2055f, 11.1701f)
                curveTo(15.8003f, 11.2501f, 16.5495f, 11.25f, 17.448f, 11.25f)
                horizontalLineTo(17.552f)
                curveTo(18.4505f, 11.25f, 19.1997f, 11.2501f, 19.7945f, 11.1701f)
                curveTo(20.4223f, 11.0857f, 20.9891f, 10.9f, 21.4445f, 10.4445f)
                curveTo(21.9f, 9.9891f, 22.0857f, 9.4223f, 22.1701f, 8.7945f)
                curveTo(22.2501f, 8.1997f, 22.25f, 7.4505f, 22.25f, 6.552f)
                verticalLineTo(6.448f)
                curveTo(22.25f, 5.5495f, 22.2501f, 4.8003f, 22.1701f, 4.2055f)
                curveTo(22.0857f, 3.5777f, 21.9f, 3.0109f, 21.4445f, 2.5555f)
                curveTo(20.9891f, 2.1f, 20.4223f, 1.9143f, 19.7945f, 1.8299f)
                curveTo(19.1997f, 1.75f, 18.4505f, 1.75f, 17.552f, 1.75f)
                horizontalLineTo(17.448f)
                close()
                moveTo(14.6161f, 3.6161f)
                curveTo(14.7464f, 3.4858f, 14.9439f, 3.3786f, 15.4054f, 3.3165f)
                curveTo(15.8884f, 3.2516f, 16.536f, 3.25f, 17.5f, 3.25f)
                curveTo(18.464f, 3.25f, 19.1116f, 3.2516f, 19.5946f, 3.3165f)
                curveTo(20.0561f, 3.3786f, 20.2536f, 3.4858f, 20.3839f, 3.6161f)
                curveTo(20.5142f, 3.7464f, 20.6214f, 3.9439f, 20.6835f, 4.4054f)
                curveTo(20.7484f, 4.8884f, 20.75f, 5.536f, 20.75f, 6.5f)
                curveTo(20.75f, 7.464f, 20.7484f, 8.1116f, 20.6835f, 8.5946f)
                curveTo(20.6214f, 9.0561f, 20.5142f, 9.2536f, 20.3839f, 9.3839f)
                curveTo(20.2536f, 9.5142f, 20.0561f, 9.6214f, 19.5946f, 9.6835f)
                curveTo(19.1116f, 9.7484f, 18.464f, 9.75f, 17.5f, 9.75f)
                curveTo(16.536f, 9.75f, 15.8884f, 9.7484f, 15.4054f, 9.6835f)
                curveTo(14.9439f, 9.6214f, 14.7464f, 9.5142f, 14.6161f, 9.3839f)
                curveTo(14.4858f, 9.2536f, 14.3786f, 9.0561f, 14.3165f, 8.5946f)
                curveTo(14.2516f, 8.1116f, 14.25f, 7.464f, 14.25f, 6.5f)
                curveTo(14.25f, 5.536f, 14.2516f, 4.8884f, 14.3165f, 4.4054f)
                curveTo(14.3786f, 3.9439f, 14.4858f, 3.7464f, 14.6161f, 3.6161f)
                close()
            }
        }
            .build()
        return _widget!!
    }

private var _widget: ImageVector? = null
