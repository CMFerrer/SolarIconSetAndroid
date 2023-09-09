package com.chiksmedina.solar.broken.settingsfinetuning

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
import com.chiksmedina.solar.broken.SettingsFineTuningGroup

public val SettingsFineTuningGroup.Widget4: ImageVector
    get() {
        if (_widget4 != null) {
            return _widget4!!
        }
        _widget4 = Builder(name = "Widget4", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.5f, 13.0f)
                verticalLineTo(17.5f)
                curveTo(2.5f, 19.3856f, 2.5f, 20.3284f, 3.0858f, 20.9142f)
                curveTo(3.6716f, 21.5f, 4.6144f, 21.5f, 6.5f, 21.5f)
                curveTo(8.3856f, 21.5f, 9.3284f, 21.5f, 9.9142f, 20.9142f)
                curveTo(10.5f, 20.3284f, 10.5f, 19.3856f, 10.5f, 17.5f)
                verticalLineTo(6.5f)
                curveTo(10.5f, 4.6144f, 10.5f, 3.6716f, 9.9142f, 3.0858f)
                curveTo(9.3284f, 2.5f, 8.3856f, 2.5f, 6.5f, 2.5f)
                curveTo(4.6144f, 2.5f, 3.6716f, 2.5f, 3.0858f, 3.0858f)
                curveTo(2.5f, 3.6716f, 2.5f, 4.6144f, 2.5f, 6.5f)
                verticalLineTo(9.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.4995f, 18.0f)
                curveTo(21.495f, 19.5572f, 21.4458f, 20.3827f, 20.9142f, 20.9142f)
                curveTo(20.3284f, 21.5f, 19.3856f, 21.5f, 17.5f, 21.5f)
                curveTo(15.6144f, 21.5f, 14.6716f, 21.5f, 14.0858f, 20.9142f)
                curveTo(13.5f, 20.3284f, 13.5f, 19.3856f, 13.5f, 17.5f)
                verticalLineTo(15.5f)
                curveTo(13.5f, 13.6144f, 13.5f, 12.6716f, 14.0858f, 12.0858f)
                curveTo(14.6716f, 11.5f, 15.6144f, 11.5f, 17.5f, 11.5f)
                curveTo(19.3856f, 11.5f, 20.3284f, 11.5f, 20.9142f, 12.0858f)
                curveTo(21.3183f, 12.4899f, 21.4436f, 13.0638f, 21.4825f, 14.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.5f, 5.5f)
                curveTo(13.5f, 4.5681f, 13.5f, 4.1022f, 13.6522f, 3.7346f)
                curveTo(13.8552f, 3.2446f, 14.2446f, 2.8552f, 14.7346f, 2.6522f)
                curveTo(15.1022f, 2.5f, 15.5681f, 2.5f, 16.5f, 2.5f)
                horizontalLineTo(18.5f)
                curveTo(19.4319f, 2.5f, 19.8978f, 2.5f, 20.2654f, 2.6522f)
                curveTo(20.7554f, 2.8552f, 21.1448f, 3.2446f, 21.3478f, 3.7346f)
                curveTo(21.5f, 4.1022f, 21.5f, 4.5681f, 21.5f, 5.5f)
                curveTo(21.5f, 6.4319f, 21.5f, 6.8978f, 21.3478f, 7.2654f)
                curveTo(21.1448f, 7.7554f, 20.7554f, 8.1448f, 20.2654f, 8.3478f)
                curveTo(19.8978f, 8.5f, 19.4319f, 8.5f, 18.5f, 8.5f)
                horizontalLineTo(16.5f)
                curveTo(15.5681f, 8.5f, 15.1022f, 8.5f, 14.7346f, 8.3478f)
                curveTo(14.2446f, 8.1448f, 13.8552f, 7.7554f, 13.6522f, 7.2654f)
                curveTo(13.5f, 6.8978f, 13.5f, 6.4319f, 13.5f, 5.5f)
                close()
            }
        }
        .build()
        return _widget4!!
    }

private var _widget4: ImageVector? = null
