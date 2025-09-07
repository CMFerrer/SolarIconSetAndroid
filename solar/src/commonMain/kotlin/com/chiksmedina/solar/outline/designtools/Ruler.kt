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

val DesignToolsGroup.Ruler: ImageVector
    get() {
        if (_ruler != null) {
            return _ruler!!
        }
        _ruler = Builder(
            name = "Ruler", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(13.6882f, 4.1423f)
                lineTo(14.6516f, 5.1057f)
                curveTo(14.9445f, 5.3986f, 14.9445f, 5.8735f, 14.6516f, 6.1664f)
                curveTo(14.3588f, 6.4593f, 13.8839f, 6.4593f, 13.591f, 6.1664f)
                lineTo(12.6269f, 5.2023f)
                lineTo(11.5662f, 6.2629f)
                lineTo(13.2374f, 7.9341f)
                curveTo(13.5303f, 8.227f, 13.5303f, 8.7019f, 13.2374f, 8.9948f)
                curveTo(12.9445f, 9.2877f, 12.4697f, 9.2877f, 12.1768f, 8.9948f)
                lineTo(10.5056f, 7.3236f)
                lineTo(9.4449f, 8.3843f)
                lineTo(10.409f, 9.3483f)
                curveTo(10.7019f, 9.6412f, 10.7019f, 10.1161f, 10.409f, 10.409f)
                curveTo(10.1161f, 10.7019f, 9.6412f, 10.7019f, 9.3483f, 10.409f)
                lineTo(8.3843f, 9.4449f)
                lineTo(7.3236f, 10.5056f)
                lineTo(8.9948f, 12.1768f)
                curveTo(9.2877f, 12.4697f, 9.2877f, 12.9445f, 8.9948f, 13.2374f)
                curveTo(8.7019f, 13.5303f, 8.227f, 13.5303f, 7.9341f, 13.2374f)
                lineTo(6.2629f, 11.5662f)
                lineTo(5.2023f, 12.6269f)
                lineTo(6.1664f, 13.591f)
                curveTo(6.4593f, 13.8839f, 6.4593f, 14.3588f, 6.1664f, 14.6516f)
                curveTo(5.8735f, 14.9445f, 5.3986f, 14.9445f, 5.1057f, 14.6516f)
                lineTo(4.1423f, 13.6882f)
                curveTo(3.678f, 14.1568f, 3.3431f, 14.5094f, 3.1076f, 14.818f)
                curveTo(2.8176f, 15.1981f, 2.75f, 15.422f, 2.75f, 15.6157f)
                curveTo(2.75f, 15.8094f, 2.8176f, 16.0334f, 3.1076f, 16.4135f)
                curveTo(3.4108f, 16.8109f, 3.8789f, 17.2812f, 4.5757f, 17.978f)
                lineTo(6.022f, 19.4243f)
                curveTo(6.7188f, 20.1211f, 7.1891f, 20.5892f, 7.5865f, 20.8924f)
                curveTo(7.9666f, 21.1824f, 8.1906f, 21.25f, 8.3843f, 21.25f)
                curveTo(8.5779f, 21.25f, 8.8019f, 21.1824f, 9.182f, 20.8924f)
                curveTo(9.5794f, 20.5892f, 10.0497f, 20.1211f, 10.7465f, 19.4243f)
                lineTo(19.4243f, 10.7465f)
                curveTo(20.1211f, 10.0497f, 20.5892f, 9.5794f, 20.8924f, 9.182f)
                curveTo(21.1824f, 8.8019f, 21.25f, 8.5779f, 21.25f, 8.3843f)
                curveTo(21.25f, 8.1906f, 21.1824f, 7.9666f, 20.8924f, 7.5865f)
                curveTo(20.5892f, 7.1891f, 20.1211f, 6.7188f, 19.4243f, 6.022f)
                lineTo(17.978f, 4.5757f)
                curveTo(17.2812f, 3.8789f, 16.8109f, 3.4108f, 16.4135f, 3.1076f)
                curveTo(16.0334f, 2.8176f, 15.8094f, 2.75f, 15.6157f, 2.75f)
                curveTo(15.422f, 2.75f, 15.1981f, 2.8176f, 14.818f, 3.1076f)
                curveTo(14.5094f, 3.3431f, 14.1568f, 3.678f, 13.6882f, 4.1423f)
                close()
                moveTo(13.9081f, 1.9151f)
                curveTo(14.4217f, 1.5233f, 14.9622f, 1.25f, 15.6157f, 1.25f)
                curveTo(16.2693f, 1.25f, 16.8098f, 1.5233f, 17.3233f, 1.9151f)
                curveTo(17.8104f, 2.2867f, 18.3514f, 2.8278f, 19.0017f, 3.4781f)
                lineTo(20.5219f, 4.9982f)
                curveTo(21.1722f, 5.6486f, 21.7133f, 6.1896f, 22.0849f, 6.6767f)
                curveTo(22.4767f, 7.1902f, 22.75f, 7.7307f, 22.75f, 8.3843f)
                curveTo(22.75f, 9.0378f, 22.4767f, 9.5783f, 22.0849f, 10.0919f)
                curveTo(21.7133f, 10.5789f, 21.1722f, 11.12f, 20.5219f, 11.7703f)
                lineTo(11.7703f, 20.5219f)
                curveTo(11.12f, 21.1722f, 10.5789f, 21.7133f, 10.0919f, 22.0849f)
                curveTo(9.5783f, 22.4767f, 9.0378f, 22.75f, 8.3843f, 22.75f)
                curveTo(7.7307f, 22.75f, 7.1902f, 22.4767f, 6.6767f, 22.0849f)
                curveTo(6.1896f, 21.7133f, 5.6486f, 21.1722f, 4.9982f, 20.5219f)
                lineTo(3.4781f, 19.0017f)
                curveTo(2.8278f, 18.3514f, 2.2867f, 17.8104f, 1.9151f, 17.3233f)
                curveTo(1.5233f, 16.8098f, 1.25f, 16.2693f, 1.25f, 15.6157f)
                curveTo(1.25f, 14.9622f, 1.5233f, 14.4217f, 1.9151f, 13.9081f)
                curveTo(2.2867f, 13.4211f, 2.8278f, 12.88f, 3.4782f, 12.2297f)
                lineTo(12.2297f, 3.4781f)
                curveTo(12.88f, 2.8278f, 13.4211f, 2.2867f, 13.9081f, 1.9151f)
                close()
            }
        }
            .build()
        return _ruler!!
    }

private var _ruler: ImageVector? = null
