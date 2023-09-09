package com.chiksmedina.solar.bold.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.ArrowsGroup

public val ArrowsGroup.Restart: ImageVector
    get() {
        if (_restart != null) {
            return _restart!!
        }
        _restart = Builder(name = "Restart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.2577f, 3.5083f)
                curveTo(18.538f, 3.6244f, 18.7207f, 3.8979f, 18.7207f, 4.2012f)
                verticalLineTo(8.4438f)
                curveTo(18.7207f, 8.8581f, 18.3849f, 9.1938f, 17.9707f, 9.1938f)
                horizontalLineTo(13.728f)
                curveTo(13.4247f, 9.1938f, 13.1512f, 9.0111f, 13.0351f, 8.7309f)
                curveTo(12.9191f, 8.4506f, 12.9832f, 8.128f, 13.1977f, 7.9135f)
                lineTo(14.8007f, 6.3105f)
                curveTo(12.1674f, 5.2091f, 9.0161f, 5.7309f, 6.8735f, 7.8735f)
                curveTo(4.0422f, 10.7048f, 4.0422f, 15.2952f, 6.8735f, 18.1265f)
                curveTo(9.7048f, 20.9578f, 14.2952f, 20.9578f, 17.1265f, 18.1265f)
                curveTo(18.7727f, 16.4803f, 19.4622f, 14.2401f, 19.1935f, 12.0937f)
                curveTo(19.142f, 11.6827f, 19.4335f, 11.3078f, 19.8445f, 11.2563f)
                curveTo(20.2555f, 11.2049f, 20.6304f, 11.4963f, 20.6819f, 11.9073f)
                curveTo(21.0057f, 14.4934f, 20.1746f, 17.1997f, 18.1872f, 19.1872f)
                curveTo(14.7701f, 22.6043f, 9.2299f, 22.6043f, 5.8128f, 19.1872f)
                curveTo(2.3957f, 15.7701f, 2.3957f, 10.2299f, 5.8128f, 6.8128f)
                curveTo(8.5512f, 4.0744f, 12.6515f, 3.5312f, 15.9309f, 5.1803f)
                lineTo(17.4404f, 3.6709f)
                curveTo(17.6549f, 3.4564f, 17.9774f, 3.3922f, 18.2577f, 3.5083f)
                close()
            }
        }
        .build()
        return _restart!!
    }

private var _restart: ImageVector? = null
