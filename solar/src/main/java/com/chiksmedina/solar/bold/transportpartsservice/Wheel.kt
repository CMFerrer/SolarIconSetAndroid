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

public val TransportPartsServiceGroup.Wheel: ImageVector
    get() {
        if (_wheel != null) {
            return _wheel!!
        }
        _wheel = Builder(name = "Wheel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF1C274C)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(17.9536f, 12.7499f)
                horizontalLineTo(14.9055f)
                curveTo(14.7675f, 13.2861f, 14.485f, 13.7644f, 14.1019f, 14.1406f)
                lineTo(15.6262f, 16.7807f)
                curveTo(16.8809f, 15.8275f, 17.7489f, 14.3917f, 17.9536f, 12.7499f)
                close()
                moveTo(14.3277f, 17.5318f)
                lineTo(12.8032f, 14.8913f)
                curveTo(12.5476f, 14.9621f, 12.2782f, 15.0f, 12.0f, 15.0f)
                curveTo(11.7218f, 15.0f, 11.4524f, 14.9621f, 11.1967f, 14.8912f)
                lineTo(9.6722f, 17.5317f)
                curveTo(10.388f, 17.8333f, 11.1745f, 18.0f, 12.0f, 18.0f)
                curveTo(12.8255f, 18.0f, 13.612f, 17.8333f, 14.3277f, 17.5318f)
                close()
                moveTo(8.3738f, 16.7806f)
                lineTo(9.8981f, 14.1405f)
                curveTo(9.515f, 13.7643f, 9.2325f, 13.2861f, 9.0945f, 12.7499f)
                horizontalLineTo(6.0464f)
                curveTo(6.2511f, 14.3917f, 7.1191f, 15.8275f, 8.3738f, 16.7806f)
                close()
                moveTo(17.9536f, 11.2499f)
                horizontalLineTo(14.9055f)
                curveTo(14.7674f, 10.7137f, 14.4849f, 10.2355f, 14.1018f, 9.8594f)
                lineTo(15.6261f, 7.2193f)
                curveTo(16.8808f, 8.1724f, 17.7488f, 9.6081f, 17.9536f, 11.2499f)
                close()
                moveTo(14.3277f, 6.4682f)
                curveTo(13.6119f, 6.1667f, 12.8254f, 6.0f, 12.0f, 6.0f)
                curveTo(11.1746f, 6.0f, 10.388f, 6.1667f, 9.6723f, 6.4682f)
                lineTo(11.1968f, 9.1087f)
                curveTo(11.4524f, 9.0379f, 11.7218f, 9.0f, 12.0f, 9.0f)
                curveTo(12.2782f, 9.0f, 12.5475f, 9.0379f, 12.8032f, 9.1087f)
                lineTo(14.3277f, 6.4682f)
                close()
                moveTo(9.8981f, 9.8594f)
                lineTo(8.3738f, 7.2193f)
                curveTo(7.1192f, 8.1724f, 6.2512f, 9.6082f, 6.0464f, 11.2499f)
                horizontalLineTo(9.0946f)
                curveTo(9.2326f, 10.7137f, 9.5151f, 10.2356f, 9.8981f, 9.8594f)
                close()
            }
        }
        .build()
        return _wheel!!
    }

private var _wheel: ImageVector? = null
