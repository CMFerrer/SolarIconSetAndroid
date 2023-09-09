package com.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.EssentionalUiGroup

public val EssentionalUiGroup.BatteryChargeMinimalistic: ImageVector
    get() {
        if (_batteryChargeMinimalistic != null) {
            return _batteryChargeMinimalistic!!
        }
        _batteryChargeMinimalistic = Builder(name = "BatteryChargeMinimalistic", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0762f, 9.4801f)
                curveTo(12.3413f, 9.1619f, 12.2983f, 8.689f, 11.9801f, 8.4238f)
                curveTo(11.6619f, 8.1587f, 11.189f, 8.2017f, 10.9238f, 8.5199f)
                lineTo(8.4238f, 11.5199f)
                curveTo(8.2375f, 11.7434f, 8.1974f, 12.0546f, 8.3208f, 12.3181f)
                curveTo(8.4442f, 12.5817f, 8.709f, 12.75f, 9.0f, 12.75f)
                horizontalLineTo(10.8987f)
                lineTo(9.4238f, 14.5199f)
                curveTo(9.1587f, 14.8381f, 9.2016f, 15.311f, 9.5199f, 15.5762f)
                curveTo(9.8381f, 15.8413f, 10.311f, 15.7983f, 10.5762f, 15.4801f)
                lineTo(13.0762f, 12.4801f)
                curveTo(13.2625f, 12.2566f, 13.3026f, 11.9454f, 13.1792f, 11.6819f)
                curveTo(13.0558f, 11.4183f, 12.791f, 11.25f, 12.5f, 11.25f)
                horizontalLineTo(10.6013f)
                lineTo(12.0762f, 9.4801f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.9436f, 3.25f)
                horizontalLineTo(11.5564f)
                curveTo(13.3942f, 3.25f, 14.8498f, 3.25f, 15.989f, 3.4031f)
                curveTo(17.1614f, 3.5608f, 18.1104f, 3.8929f, 18.8588f, 4.6412f)
                curveTo(19.6071f, 5.3896f, 19.9392f, 6.3386f, 20.0969f, 7.511f)
                curveTo(20.25f, 8.6502f, 20.25f, 10.1058f, 20.25f, 11.9435f)
                verticalLineTo(12.0564f)
                curveTo(20.25f, 13.8942f, 20.25f, 15.3498f, 20.0969f, 16.489f)
                curveTo(19.9392f, 17.6614f, 19.6071f, 18.6104f, 18.8588f, 19.3588f)
                curveTo(18.1104f, 20.1071f, 17.1614f, 20.4392f, 15.989f, 20.5969f)
                curveTo(14.8498f, 20.75f, 13.3942f, 20.75f, 11.5565f, 20.75f)
                horizontalLineTo(9.9436f)
                curveTo(8.1059f, 20.75f, 6.6502f, 20.75f, 5.511f, 20.5969f)
                curveTo(4.3386f, 20.4392f, 3.3896f, 20.1071f, 2.6412f, 19.3588f)
                curveTo(1.8929f, 18.6104f, 1.5608f, 17.6614f, 1.4031f, 16.489f)
                curveTo(1.25f, 15.3498f, 1.25f, 13.8942f, 1.25f, 12.0564f)
                verticalLineTo(11.9436f)
                curveTo(1.25f, 10.1058f, 1.25f, 8.6502f, 1.4031f, 7.511f)
                curveTo(1.5608f, 6.3386f, 1.8929f, 5.3896f, 2.6412f, 4.6412f)
                curveTo(3.3896f, 3.8929f, 4.3386f, 3.5608f, 5.511f, 3.4031f)
                curveTo(6.6502f, 3.25f, 8.1058f, 3.25f, 9.9436f, 3.25f)
                close()
                moveTo(5.7108f, 4.8898f)
                curveTo(4.7048f, 5.025f, 4.1251f, 5.2787f, 3.7019f, 5.7019f)
                curveTo(3.2787f, 6.1251f, 3.025f, 6.7048f, 2.8898f, 7.7108f)
                curveTo(2.7516f, 8.7385f, 2.75f, 10.0932f, 2.75f, 12.0f)
                curveTo(2.75f, 13.9068f, 2.7516f, 15.2615f, 2.8898f, 16.2892f)
                curveTo(3.025f, 17.2952f, 3.2787f, 17.8749f, 3.7019f, 18.2981f)
                curveTo(4.1251f, 18.7213f, 4.7048f, 18.975f, 5.7108f, 19.1102f)
                curveTo(6.7385f, 19.2484f, 8.0932f, 19.25f, 10.0f, 19.25f)
                horizontalLineTo(11.5f)
                curveTo(13.4068f, 19.25f, 14.7615f, 19.2484f, 15.7892f, 19.1102f)
                curveTo(16.7952f, 18.975f, 17.3749f, 18.7213f, 17.7981f, 18.2981f)
                curveTo(18.2213f, 17.8749f, 18.475f, 17.2952f, 18.6102f, 16.2892f)
                curveTo(18.7484f, 15.2615f, 18.75f, 13.9068f, 18.75f, 12.0f)
                curveTo(18.75f, 10.0932f, 18.7484f, 8.7385f, 18.6102f, 7.7108f)
                curveTo(18.475f, 6.7048f, 18.2213f, 6.1251f, 17.7981f, 5.7019f)
                curveTo(17.3749f, 5.2787f, 16.7952f, 5.025f, 15.7892f, 4.8898f)
                curveTo(14.7615f, 4.7516f, 13.4068f, 4.75f, 11.5f, 4.75f)
                horizontalLineTo(10.0f)
                curveTo(8.0932f, 4.75f, 6.7385f, 4.7516f, 5.7108f, 4.8898f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 14.75f)
                curveTo(21.5858f, 14.75f, 21.25f, 14.4142f, 21.25f, 14.0f)
                lineTo(21.25f, 10.0f)
                curveTo(21.25f, 9.5858f, 21.5858f, 9.25f, 22.0f, 9.25f)
                curveTo(22.4142f, 9.25f, 22.75f, 9.5858f, 22.75f, 10.0f)
                lineTo(22.75f, 14.0f)
                curveTo(22.75f, 14.4142f, 22.4142f, 14.75f, 22.0f, 14.75f)
                close()
            }
        }
        .build()
        return _batteryChargeMinimalistic!!
    }

private var _batteryChargeMinimalistic: ImageVector? = null
