package com.chiksmedina.solar.bold.transportpartsservice

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.TransportPartsServiceGroup

public val TransportPartsServiceGroup.KickScooter: ImageVector
    get() {
        if (_kickScooter != null) {
            return _kickScooter!!
        }
        _kickScooter = Builder(name = "KickScooter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF1C274C)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.6312f, 4.7685f)
                curveTo(16.3898f, 4.7505f, 16.0785f, 4.75f, 15.6088f, 4.75f)
                horizontalLineTo(14.381f)
                curveTo(13.9667f, 4.75f, 13.631f, 4.4142f, 13.631f, 4.0f)
                curveTo(13.631f, 3.5858f, 13.9667f, 3.25f, 14.381f, 3.25f)
                lineTo(15.6357f, 3.25f)
                curveTo(16.0714f, 3.25f, 16.4391f, 3.25f, 16.743f, 3.2727f)
                curveTo(17.0624f, 3.2966f, 17.365f, 3.3482f, 17.6605f, 3.4793f)
                curveTo(18.1166f, 3.6815f, 18.5069f, 4.0077f, 18.7852f, 4.4213f)
                curveTo(18.966f, 4.69f, 19.0682f, 4.979f, 19.1449f, 5.2881f)
                curveTo(19.2178f, 5.5816f, 19.2784f, 5.9408f, 19.3499f, 6.3648f)
                lineTo(20.3586f, 12.3459f)
                curveTo(20.3953f, 12.5635f, 20.3343f, 12.7863f, 20.1918f, 12.9548f)
                curveTo(20.0493f, 13.1234f, 19.8398f, 13.2206f, 19.619f, 13.2206f)
                curveTo(17.1319f, 13.2206f, 15.131f, 15.2107f, 15.131f, 17.6471f)
                curveTo(15.131f, 18.0613f, 14.7952f, 18.3971f, 14.381f, 18.3971f)
                horizontalLineTo(7.42f)
                curveTo(7.0809f, 19.7531f, 5.843f, 20.75f, 4.3809f, 20.75f)
                curveTo(2.6602f, 20.75f, 1.25f, 19.3691f, 1.25f, 17.6471f)
                curveTo(1.25f, 15.925f, 2.6602f, 14.5441f, 4.3809f, 14.5441f)
                curveTo(5.843f, 14.5441f, 7.0809f, 15.541f, 7.42f, 16.8971f)
                horizontalLineTo(13.6784f)
                curveTo(14.0147f, 14.2579f, 16.1026f, 12.1673f, 18.7426f, 11.7837f)
                lineTo(17.8754f, 6.6414f)
                curveTo(17.7981f, 6.1831f, 17.7466f, 5.8808f, 17.6892f, 5.6496f)
                curveTo(17.6341f, 5.4278f, 17.5857f, 5.3255f, 17.5407f, 5.2587f)
                curveTo(17.4211f, 5.081f, 17.2522f, 4.939f, 17.0526f, 4.8505f)
                curveTo(16.9761f, 4.8166f, 16.8634f, 4.7859f, 16.6312f, 4.7685f)
                close()
                moveTo(16.4881f, 17.6471f)
                curveTo(16.4881f, 15.925f, 17.8983f, 14.5441f, 19.619f, 14.5441f)
                curveTo(21.3398f, 14.5441f, 22.75f, 15.925f, 22.75f, 17.6471f)
                curveTo(22.75f, 19.3691f, 21.3398f, 20.75f, 19.619f, 20.75f)
                curveTo(17.8983f, 20.75f, 16.4881f, 19.3691f, 16.4881f, 17.6471f)
                close()
            }
        }
        .build()
        return _kickScooter!!
    }

private var _kickScooter: ImageVector? = null
