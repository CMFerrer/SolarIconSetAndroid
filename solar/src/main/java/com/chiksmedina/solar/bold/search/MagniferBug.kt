package com.chiksmedina.solar.bold.search

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.SearchGroup

public val SearchGroup.MagniferBug: ImageVector
    get() {
        if (_magniferBug != null) {
            return _magniferBug!!
        }
        _magniferBug = Builder(name = "MagniferBug", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.8571f, 11.9474f)
                curveTo(8.8571f, 12.8755f, 9.4534f, 13.665f, 10.2857f, 13.9577f)
                verticalLineTo(10.7632f)
                horizontalLineTo(8.8571f)
                verticalLineTo(11.9474f)
                close()
                moveTo(13.0209f, 9.3421f)
                curveTo(12.7268f, 8.5142f, 11.933f, 7.9211f, 11.0f, 7.9211f)
                curveTo(10.067f, 7.9211f, 9.2732f, 8.5142f, 8.9791f, 9.3421f)
                horizontalLineTo(13.0209f)
                close()
                moveTo(13.1429f, 10.7632f)
                horizontalLineTo(11.7143f)
                verticalLineTo(13.9577f)
                curveTo(12.5466f, 13.665f, 13.1429f, 12.8755f, 13.1429f, 11.9474f)
                verticalLineTo(10.7632f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.7883f, 21.7883f)
                curveTo(22.0706f, 21.506f, 22.0706f, 21.0483f, 21.7883f, 20.7659f)
                lineTo(18.1224f, 17.1002f)
                curveTo(19.4884f, 15.5007f, 20.3133f, 13.425f, 20.3133f, 11.1566f)
                curveTo(20.3133f, 6.0996f, 16.2137f, 2.0f, 11.1566f, 2.0f)
                curveTo(6.0996f, 2.0f, 2.0f, 6.0996f, 2.0f, 11.1566f)
                curveTo(2.0f, 16.2137f, 6.0996f, 20.3133f, 11.1566f, 20.3133f)
                curveTo(13.4249f, 20.3133f, 15.5006f, 19.4885f, 17.1f, 18.1225f)
                lineTo(20.7659f, 21.7883f)
                curveTo(21.0483f, 22.0706f, 21.506f, 22.0706f, 21.7883f, 21.7883f)
                close()
                moveTo(8.1895f, 7.8604f)
                curveTo(8.8433f, 7.0321f, 9.8592f, 6.5f, 11.0f, 6.5f)
                curveTo(12.1408f, 6.5f, 13.1567f, 7.0321f, 13.8105f, 7.8604f)
                lineTo(14.4901f, 7.5224f)
                curveTo(14.8429f, 7.3469f, 15.272f, 7.4892f, 15.4484f, 7.8401f)
                curveTo(15.6248f, 8.1911f, 15.4818f, 8.6179f, 15.129f, 8.7934f)
                lineTo(14.4501f, 9.1311f)
                curveTo(14.5292f, 9.425f, 14.5714f, 9.7339f, 14.5714f, 10.0526f)
                verticalLineTo(10.2895f)
                horizontalLineTo(15.2857f)
                curveTo(15.6802f, 10.2895f, 16.0f, 10.6076f, 16.0f, 11.0f)
                curveTo(16.0f, 11.3924f, 15.6802f, 11.7105f, 15.2857f, 11.7105f)
                horizontalLineTo(14.5714f)
                verticalLineTo(11.9474f)
                curveTo(14.5714f, 12.2661f, 14.5292f, 12.575f, 14.4501f, 12.8689f)
                lineTo(15.129f, 13.2066f)
                curveTo(15.4818f, 13.3821f, 15.6248f, 13.8089f, 15.4484f, 14.1599f)
                curveTo(15.272f, 14.5108f, 14.8429f, 14.6531f, 14.4901f, 14.4776f)
                lineTo(13.8105f, 14.1396f)
                curveTo(13.1567f, 14.9679f, 12.1408f, 15.5f, 11.0f, 15.5f)
                curveTo(9.8592f, 15.5f, 8.8433f, 14.9679f, 8.1895f, 14.1396f)
                lineTo(7.5099f, 14.4776f)
                curveTo(7.1571f, 14.6531f, 6.728f, 14.5108f, 6.5516f, 14.1599f)
                curveTo(6.3752f, 13.8089f, 6.5182f, 13.3821f, 6.871f, 13.2066f)
                lineTo(7.5499f, 12.8689f)
                curveTo(7.4708f, 12.575f, 7.4286f, 12.2661f, 7.4286f, 11.9474f)
                verticalLineTo(11.7105f)
                horizontalLineTo(6.7143f)
                curveTo(6.3198f, 11.7105f, 6.0f, 11.3924f, 6.0f, 11.0f)
                curveTo(6.0f, 10.6076f, 6.3198f, 10.2895f, 6.7143f, 10.2895f)
                horizontalLineTo(7.4286f)
                verticalLineTo(10.0526f)
                curveTo(7.4286f, 9.7339f, 7.4708f, 9.425f, 7.5499f, 9.1311f)
                lineTo(6.871f, 8.7934f)
                curveTo(6.5182f, 8.6179f, 6.3752f, 8.1911f, 6.5516f, 7.8401f)
                curveTo(6.728f, 7.4892f, 7.1571f, 7.3469f, 7.5099f, 7.5224f)
                lineTo(8.1895f, 7.8604f)
                close()
            }
        }
        .build()
        return _magniferBug!!
    }

private var _magniferBug: ImageVector? = null
