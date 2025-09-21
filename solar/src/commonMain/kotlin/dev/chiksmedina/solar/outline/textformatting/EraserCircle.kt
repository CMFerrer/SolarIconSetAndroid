package dev.chiksmedina.solar.outline.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.TextFormattingGroup

val TextFormattingGroup.EraserCircle: ImageVector
    get() {
        if (_eraserCircle != null) {
            return _eraserCircle!!
        }
        _eraserCircle = Builder(
            name = "EraserCircle", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.8883f, 16.8959f)
                curveTo(12.3621f, 17.4222f, 11.9147f, 17.8697f, 11.5096f, 18.1788f)
                curveTo(11.078f, 18.508f, 10.6076f, 18.75f, 10.0318f, 18.75f)
                curveTo(9.456f, 18.75f, 8.9856f, 18.508f, 8.5541f, 18.1788f)
                curveTo(8.149f, 17.8697f, 7.7016f, 17.4222f, 7.1753f, 16.8959f)
                lineTo(7.1041f, 16.8246f)
                curveTo(6.5778f, 16.2984f, 6.1303f, 15.851f, 5.8212f, 15.4459f)
                curveTo(5.492f, 15.0144f, 5.25f, 14.544f, 5.25f, 13.9682f)
                curveTo(5.25f, 13.3924f, 5.492f, 12.922f, 5.8212f, 12.4904f)
                curveTo(6.1303f, 12.0853f, 6.5778f, 11.6379f, 7.1041f, 11.1117f)
                lineTo(11.1117f, 7.1041f)
                curveTo(11.6379f, 6.5778f, 12.0853f, 6.1303f, 12.4904f, 5.8212f)
                curveTo(12.922f, 5.492f, 13.3924f, 5.25f, 13.9682f, 5.25f)
                curveTo(14.544f, 5.25f, 15.0144f, 5.492f, 15.4459f, 5.8212f)
                curveTo(15.851f, 6.1303f, 16.2984f, 6.5778f, 16.8246f, 7.1041f)
                lineTo(16.8959f, 7.1753f)
                curveTo(17.4222f, 7.7016f, 17.8697f, 8.149f, 18.1788f, 8.5541f)
                curveTo(18.508f, 8.9856f, 18.75f, 9.456f, 18.75f, 10.0318f)
                curveTo(18.75f, 10.6076f, 18.508f, 11.078f, 18.1788f, 11.5096f)
                curveTo(17.8697f, 11.9147f, 17.4222f, 12.3621f, 16.8959f, 12.8883f)
                lineTo(12.8883f, 16.8959f)
                close()
                moveTo(12.1367f, 8.2004f)
                curveTo(12.7084f, 7.6287f, 13.0849f, 7.2544f, 13.4003f, 7.0138f)
                curveTo(13.6984f, 6.7863f, 13.8522f, 6.75f, 13.9682f, 6.75f)
                curveTo(14.0841f, 6.75f, 14.2379f, 6.7863f, 14.536f, 7.0138f)
                curveTo(14.8514f, 7.2544f, 15.228f, 7.6287f, 15.7996f, 8.2004f)
                curveTo(16.3713f, 8.772f, 16.7456f, 9.1486f, 16.9862f, 9.464f)
                curveTo(17.2137f, 9.7621f, 17.25f, 9.9159f, 17.25f, 10.0318f)
                curveTo(17.25f, 10.1478f, 17.2137f, 10.3016f, 16.9862f, 10.5997f)
                curveTo(16.7456f, 10.9151f, 16.3713f, 11.2916f, 15.7996f, 11.8633f)
                lineTo(13.1809f, 14.482f)
                lineTo(9.518f, 10.8191f)
                lineTo(12.1367f, 8.2004f)
                close()
                moveTo(8.4573f, 11.8798f)
                lineTo(12.1202f, 15.5427f)
                lineTo(11.8633f, 15.7996f)
                curveTo(11.2916f, 16.3713f, 10.9151f, 16.7456f, 10.5997f, 16.9862f)
                curveTo(10.3016f, 17.2137f, 10.1478f, 17.25f, 10.0318f, 17.25f)
                curveTo(9.9159f, 17.25f, 9.7621f, 17.2137f, 9.464f, 16.9862f)
                curveTo(9.1486f, 16.7456f, 8.772f, 16.3713f, 8.2004f, 15.7996f)
                curveTo(7.6287f, 15.228f, 7.2544f, 14.8514f, 7.0138f, 14.536f)
                curveTo(6.7863f, 14.2379f, 6.75f, 14.0841f, 6.75f, 13.9682f)
                curveTo(6.75f, 13.8522f, 6.7863f, 13.6984f, 7.0138f, 13.4003f)
                curveTo(7.2544f, 13.0849f, 7.6287f, 12.7084f, 8.2004f, 12.1367f)
                lineTo(8.4573f, 11.8798f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 1.25f)
                curveTo(6.0629f, 1.25f, 1.25f, 6.0629f, 1.25f, 12.0f)
                curveTo(1.25f, 17.9371f, 6.0629f, 22.75f, 12.0f, 22.75f)
                curveTo(17.9371f, 22.75f, 22.75f, 17.9371f, 22.75f, 12.0f)
                curveTo(22.75f, 6.0629f, 17.9371f, 1.25f, 12.0f, 1.25f)
                close()
                moveTo(2.75f, 12.0f)
                curveTo(2.75f, 6.8914f, 6.8914f, 2.75f, 12.0f, 2.75f)
                curveTo(17.1086f, 2.75f, 21.25f, 6.8914f, 21.25f, 12.0f)
                curveTo(21.25f, 17.1086f, 17.1086f, 21.25f, 12.0f, 21.25f)
                curveTo(6.8914f, 21.25f, 2.75f, 17.1086f, 2.75f, 12.0f)
                close()
            }
        }
            .build()
        return _eraserCircle!!
    }

private var _eraserCircle: ImageVector? = null
