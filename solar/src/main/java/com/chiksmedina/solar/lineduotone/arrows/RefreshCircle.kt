package com.chiksmedina.solar.lineduotone.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.lineduotone.ArrowsGroup

public val ArrowsGroup.RefreshCircle: ImageVector
    get() {
        if (_refreshCircle != null) {
            return _refreshCircle!!
        }
        _refreshCircle = Builder(name = "RefreshCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.3777f, 11.6296f)
                lineTo(6.6277f, 11.6296f)
                lineTo(6.6277f, 11.6296f)
                lineTo(7.3777f, 11.6296f)
                close()
                moveTo(7.3777f, 12.5556f)
                lineTo(6.8162f, 13.0528f)
                curveTo(6.9515f, 13.2056f, 7.1432f, 13.2966f, 7.3471f, 13.3049f)
                curveTo(7.551f, 13.3133f, 7.7495f, 13.2381f, 7.8967f, 13.0969f)
                lineTo(7.3777f, 12.5556f)
                close()
                moveTo(9.5192f, 11.5414f)
                curveTo(9.8182f, 11.2547f, 9.8282f, 10.7799f, 9.5415f, 10.4809f)
                curveTo(9.2548f, 10.182f, 8.7801f, 10.172f, 8.4811f, 10.4586f)
                lineTo(9.5192f, 11.5414f)
                close()
                moveTo(6.5616f, 10.5028f)
                curveTo(6.287f, 10.1927f, 5.813f, 10.1639f, 5.5029f, 10.4385f)
                curveTo(5.1928f, 10.7131f, 5.164f, 11.1871f, 5.4386f, 11.4972f)
                lineTo(6.5616f, 10.5028f)
                close()
                moveTo(14.9318f, 9.0093f)
                curveTo(15.2131f, 9.3134f, 15.6876f, 9.3318f, 15.9917f, 9.0506f)
                curveTo(16.2957f, 8.7693f, 16.3142f, 8.2948f, 16.0329f, 7.9907f)
                lineTo(14.9318f, 9.0093f)
                close()
                moveTo(12.0438f, 6.25f)
                curveTo(9.0581f, 6.25f, 6.6277f, 8.653f, 6.6277f, 11.6296f)
                horizontalLineTo(8.1277f)
                curveTo(8.1277f, 9.4925f, 9.8754f, 7.75f, 12.0438f, 7.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(6.6277f, 11.6296f)
                lineTo(6.6277f, 12.5556f)
                lineTo(8.1277f, 12.5556f)
                lineTo(8.1277f, 11.6296f)
                lineTo(6.6277f, 11.6296f)
                close()
                moveTo(7.8967f, 13.0969f)
                lineTo(9.5192f, 11.5414f)
                lineTo(8.4811f, 10.4586f)
                lineTo(6.8586f, 12.0142f)
                lineTo(7.8967f, 13.0969f)
                close()
                moveTo(7.9392f, 12.0583f)
                lineTo(6.5616f, 10.5028f)
                lineTo(5.4386f, 11.4972f)
                lineTo(6.8162f, 13.0528f)
                lineTo(7.9392f, 12.0583f)
                close()
                moveTo(16.0329f, 7.9907f)
                curveTo(15.0433f, 6.9209f, 13.6213f, 6.25f, 12.0438f, 6.25f)
                verticalLineTo(7.75f)
                curveTo(13.188f, 7.75f, 14.2156f, 8.235f, 14.9318f, 9.0093f)
                lineTo(16.0329f, 7.9907f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.6188f, 11.4443f)
                lineTo(17.1795f, 10.9462f)
                curveTo(17.044f, 10.7937f, 16.8523f, 10.703f, 16.6485f, 10.6949f)
                curveTo(16.4447f, 10.6868f, 16.2464f, 10.7621f, 16.0993f, 10.9034f)
                lineTo(16.6188f, 11.4443f)
                close()
                moveTo(14.4805f, 12.4581f)
                curveTo(14.1817f, 12.745f, 14.1722f, 13.2198f, 14.4591f, 13.5185f)
                curveTo(14.746f, 13.8173f, 15.2208f, 13.8269f, 15.5195f, 13.54f)
                lineTo(14.4805f, 12.4581f)
                close()
                moveTo(17.4393f, 13.4972f)
                curveTo(17.7144f, 13.8068f, 18.1885f, 13.8348f, 18.4981f, 13.5597f)
                curveTo(18.8078f, 13.2846f, 18.8358f, 12.8106f, 18.5607f, 12.5009f)
                lineTo(17.4393f, 13.4972f)
                close()
                moveTo(9.0469f, 15.0047f)
                curveTo(8.7634f, 14.7027f, 8.2888f, 14.6876f, 7.9868f, 14.9711f)
                curveTo(7.6847f, 15.2545f, 7.6697f, 15.7292f, 7.9531f, 16.0312f)
                lineTo(9.0469f, 15.0047f)
                close()
                moveTo(11.9348f, 17.7499f)
                curveTo(14.9276f, 17.7499f, 17.3688f, 15.3496f, 17.3688f, 12.3703f)
                horizontalLineTo(15.8688f)
                curveTo(15.8688f, 14.5047f, 14.1158f, 16.2499f, 11.9348f, 16.2499f)
                verticalLineTo(17.7499f)
                close()
                moveTo(17.3688f, 12.3703f)
                verticalLineTo(11.4443f)
                horizontalLineTo(15.8688f)
                verticalLineTo(12.3703f)
                horizontalLineTo(17.3688f)
                close()
                moveTo(16.0993f, 10.9034f)
                lineTo(14.4805f, 12.4581f)
                lineTo(15.5195f, 13.54f)
                lineTo(17.1383f, 11.9853f)
                lineTo(16.0993f, 10.9034f)
                close()
                moveTo(16.0581f, 11.9425f)
                lineTo(17.4393f, 13.4972f)
                lineTo(18.5607f, 12.5009f)
                lineTo(17.1795f, 10.9462f)
                lineTo(16.0581f, 11.9425f)
                close()
                moveTo(7.9531f, 16.0312f)
                curveTo(8.9454f, 17.0885f, 10.3635f, 17.7499f, 11.9348f, 17.7499f)
                verticalLineTo(16.2499f)
                curveTo(10.792f, 16.2499f, 9.7655f, 15.7704f, 9.0469f, 15.0047f)
                lineTo(7.9531f, 16.0312f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-10.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 20.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -20.0f, 0.0f)
            }
        }
        .build()
        return _refreshCircle!!
    }

private var _refreshCircle: ImageVector? = null
